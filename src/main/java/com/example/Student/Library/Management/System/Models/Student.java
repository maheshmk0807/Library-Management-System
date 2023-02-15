package com.example.Student.Library.Management.System.Models;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
@Table(name = "student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    @Column(unique = true)
    private String email;

    private String mobile;
    private int age;
    private String country;

    @OneToOne(mappedBy = "studentVariableName",cascade = CascadeType.ALL)
    private Card cardVariableName; //Set this in student

    public Student() {
    }

    public Card getcardVariableName() {
        return cardVariableName;
    }

    public void setcardVariableName (Card cardVariableName) {
        this.cardVariableName = cardVariableName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
