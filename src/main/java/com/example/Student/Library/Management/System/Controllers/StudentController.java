package com.example.Student.Library.Management.System.Controllers;

import com.example.Student.Library.Management.System.DTO.StudentUpdateMobileDto;
import com.example.Student.Library.Management.System.Models.Student;
import com.example.Student.Library.Management.System.Services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public String createStudent(@RequestBody Student student){
        return studentService.createStudent(student);
    }

    @GetMapping("/get_user")
    public String getNameByEmail(@RequestParam String email){
        return studentService.findNameByEmail(email);
    }

    @PutMapping("/update_mobile")
    public String updateMobile(@RequestBody StudentUpdateMobileDto studentUpdateMobileDto){
        return studentService.updateMobile(studentUpdateMobileDto);
    }




}
