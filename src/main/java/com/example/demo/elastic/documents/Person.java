package com.example.demo.elastic.documents;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;
import org.springframework.data.elasticsearch.annotations.Setting;

import javax.persistence.Id;

@Document(indexName="person")
@Setting(settingPath = "static/settings.json")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    //field annotation is for ES fields
    @Id
    @Field(type= FieldType.Keyword)
    private String id;
    @Field(type= FieldType.Text)
    private String name;
}
