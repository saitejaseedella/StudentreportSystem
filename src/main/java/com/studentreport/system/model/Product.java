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




    public int getAverage() {
        average = (getEnglish()+getScience()+getMaths())/3;
        return average;
    }


}
