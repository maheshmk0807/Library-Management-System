package com.example.Student.Library.Management.System.Repositories;

import com.example.Student.Library.Management.System.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Integer> {

    Student findByEmail(String email);

    List<Student> findByCountry(String country);
    //Select * from student where countryName=country;




}
