package com.example.Student.Library.Management.System.Services;

import com.example.Student.Library.Management.System.Enums.CardStatus;
import com.example.Student.Library.Management.System.Models.Card;
import com.example.Student.Library.Management.System.Models.Student;
import com.example.Student.Library.Management.System.Repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public String createStudent(Student student){
        //Student from the postman is already the basic attributes set
        //Card should be auto generated when createStudent function is called
        Card card =new Card();
        card.setCardStatus(CardStatus.ACTIVATED); //Card status is being set
        card.setStudentVariableName(student); //Foreign key col attribute value

        //goto student
        student.setcardVariableName(card);

        //Both entity ready
        //Bidirectional Mapping -> Save only Parent then child automatically saved
        studentRepository.save(student); // Save by cascading ie. Child auto saved
        return "Student and Card added !";
    }
}
