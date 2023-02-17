package com.example.Student.Library.Management.System.Services;

import com.example.Student.Library.Management.System.Models.Author;
import com.example.Student.Library.Management.System.Models.Book;
import com.example.Student.Library.Management.System.Repositories.AuthorRepository;
import com.example.Student.Library.Management.System.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class BookService {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    AuthorRepository authorRepository;

    public String addBook(Book book) {
        //Author entity is also required because book will always have author & for connecting this book to author (ie. FK attribute in book entity)
        // Get author by author id via author repository

        //Get author id
        int authorId = book.getAuthor().getId();
        //Fetch author entity
        Author author;
        try{
             author = authorRepository.findById(authorId).get();
        }
        catch (NoSuchElementException e)
        {
            return "Author not found !";
        }
        //Set foreign key attribute in the child class
        book.setAuthor(author);
        //Update list of bookWritten in parent i.e. in Author
        author.getBooksWritten().add(book); //---Note--- : if duplicate entry try by only storing
        //Save book & update author -> Both done by Cascading effect by only updating author
        authorRepository.save(author); // Bcoz data was modified // Save Function works as Save as well as Update
        //if PK already exists it will update else if not present it creates new object

        //bookRepository.save(book); -- No need .. Auto done by cascading

        return "Book Added !";
    }
}
