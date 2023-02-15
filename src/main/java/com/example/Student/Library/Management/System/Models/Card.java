package com.example.Student.Library.Management.System.Models;

import com.example.Student.Library.Management.System.Enums.CardStatus;
import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.Date;

@Entity
@Table(name = "card")
public class Card {

    //Save this card in DB
    //Before that set its attributes
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id; // Auto Generated

    @CreationTimestamp
    private Date createdOn; // Auto Generated

    @UpdateTimestamp
    private Date updatedOn; // Auto Generated

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus; //SET in StudentService

    @OneToOne
    @JoinColumn
    private Student studentVariableName; //SET in StudentService

    public Card() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(Date updatedOn) {
        this.updatedOn = updatedOn;
    }

    public CardStatus getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }

    public Student getStudentVariableName() {
        return studentVariableName;
    }

    public void setStudentVariableName(Student studentVariableName) {
        this.studentVariableName = studentVariableName;
    }
}
