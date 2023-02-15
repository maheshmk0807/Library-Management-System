package com.example.Student.Library.Management.System.Repositories;

import com.example.Student.Library.Management.System.Models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer> {

}
