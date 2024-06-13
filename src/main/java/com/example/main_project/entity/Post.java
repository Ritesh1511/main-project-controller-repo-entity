package com.example.main_project.entity;

import javax.persistence.*;

@Entity
@Table (name="dbo" , uniqueConstraints = @UniqueConstraint(columnNames = {"col1"}))
public class Post {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;



    @Column(name = "col1" , nullable=false)
    private String col1;

    @Column(name = "col2" , nullable=false)
    private String col2;

    //all arguement contructor
    private Post(String col1 , String col2){
        this.col1=col1;
        this.col2=col2;
    }
    //no arguement contructor
    private Post(){

    }


    //getter setter

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }


}
