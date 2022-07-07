package com.crud.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    private  String employeeCode;
    private int age;
    boolean likePizza;

    public Employee() {

    }
// constructor getters en setters om bij de employee gegevens te komen/door te geven
    public Employee(Long id, String name, String email,String employeeCode, int age, boolean likePizza) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.employeeCode = employeeCode;
        this.age = age;
        this.likePizza = likePizza;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLikePizza(boolean likePizza) {
        this.likePizza = likePizza;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getEmployeeCode() {return employeeCode;}

    public int getAge() {
        return age;
    }

    public boolean isLikePizza() {
        return likePizza;
    }

}
