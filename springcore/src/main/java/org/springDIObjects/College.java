package org.springDIObjects;

public class College {
    private int id;
    private String name;

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

    public String getCollegeDetais(){
       return ("college name is : "+name +" registed with id : " + id);
    }
}
