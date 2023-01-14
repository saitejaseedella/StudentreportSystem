package com.studentreport.system.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;
@Data
@Document(indexName = "products")
public class Product {

    @Id
    private String id;

    private int average;
    @Field(type = FieldType.Text, name = "name")
    private String name;

    @Field(type = FieldType.Integer, name = "Maths")
    private int Maths;

    @Field(type = FieldType.Integer, name = "Science")
    private int Science;

    @Field(type = FieldType.Integer, name = "English")
    private int English;

    @Field(type = FieldType.Integer, name = "semester")
    private int semester;

    /*@Field(type = FieldType.Integer, name = "average")
    private int average=(English+Science+Maths)/3;*/

/*    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaths() {
        return Maths;
    }

    public void setMaths(int maths) {
        Maths = maths;
    }

    public int getScience() {
        return Science;
    }

    public void setScience(int science) {
        Science = science;
    }

    public int getEnglish() {
        return English;
    }

    public void setEnglish(int english) {
        English = english;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getAverage() {
        return average;
    }*/


    public int getAverage() {
        average = (getEnglish()+getScience()+getMaths())/3;
        return average;
    }


}
