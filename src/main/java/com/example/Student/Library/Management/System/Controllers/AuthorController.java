package com.example.Student.Library.Management.System.Controllers;

import com.example.Student.Library.Management.System.Models.Author;
import com.example.Student.Library.Management.System.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author") // / is optional but good to write
public class AuthorController {

    @Autowired
    AuthorService authorService;
    @PostMapping("/add")  // / is optional but good to write
    public String createAuthor(@RequestBody Author author){
        return authorService.createAuthor(author);
    }

}
