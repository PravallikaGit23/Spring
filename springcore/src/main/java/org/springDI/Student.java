package org.springDI;

public class Student {
    String name;
    int id;

    public Student(){
        //no arg constructor for creating beans with setter injection
    }

    //
    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    void getStudentDetails(){
        System.out.println("Student name is: "+name +" id is : "+ id);
    }
}
