package com.example.Student.Library.Management.System.DTO;

public class StudentUpdateMobileDto {

    private int id;
    private String mobile;

    public StudentUpdateMobileDto() {
    }

    public StudentUpdateMobileDto(int id, String mobile) {
        this.id = id;
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
