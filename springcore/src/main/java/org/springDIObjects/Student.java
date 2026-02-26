package org.springDIObjects;


public class Student {
    private int id;
    private College college;
    private String name;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getStudentDetails(){
        System.out.println(" student name : "+ name +" id is :" + id + " studying in : "+ college.getCollegeDetais());
    }
}
