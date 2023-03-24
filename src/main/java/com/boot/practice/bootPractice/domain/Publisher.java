package com.boot.practice.bootPractice.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.springframework.boot.autoconfigure.web.WebProperties;

@Entity
public class Publisher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Pub_id;
    private String name;
    private String city;

    public Long getPub_id() {
        return Pub_id;
    }

    public Publisher(Long pub_id, String name, String city) {
        Pub_id = pub_id;
        this.name = name;
        this.city = city;
    }

    public Publisher() {
    }

    public void setPub_id(Long pub_id) {
        Pub_id = pub_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    
}
