package com.javalec.hashSet;

public class Student {
    
    private String name;
    private int grade;
    
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }
    
    @Override
    public String toString() {
        return name + " : " + grade;
    }
    
    @Override
    public int hashCode() {
        return toString().hashCode();
    }
    
    @Override
    public boolean equals(Object obj) {
        String compareValue = obj.toString();
        String thisValue = toString();
        return thisValue.equals(compareValue);
    }
}
