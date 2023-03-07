package com.example.Student.Library.Management.System.Services;

import com.example.Student.Library.Management.System.DTO.AuthorEntryDto;
import com.example.Student.Library.Management.System.Models.Author;
import com.example.Student.Library.Management.System.Repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthorService {
    @Autowired
    AuthorRepository authorRepository;
    public String createAuthor(AuthorEntryDto authorEntryDto) {
        // Obj is of type DTO but repo interacts with only entity
        //Convert AuthorEntryDto to Author Entity

        Author author = new Author();
        author.setName(authorEntryDto.getName());
        author.setAge(authorEntryDto.getAge());
        author.setCountry(authorEntryDto.getCountry());
        author.setRating(authorEntryDto.getRating());
        authorRepository.save(author);
        return "Author added !";
    }
}
