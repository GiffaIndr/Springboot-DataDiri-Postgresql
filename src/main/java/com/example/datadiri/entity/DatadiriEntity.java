package com.example.datadiri.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "mt_datadiri")
public class DatadiriEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "gender")
    private String gender;
    @Column(name = "rombel")
    private String Rombel;
    @Column(name = "nis")
    private String NIS;

    public DatadiriEntity(){
    }

    public DatadiriEntity(Long id, String name, String gender, String rombel, String NIS) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        Rombel = rombel;
        this.NIS = NIS;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRombel() {
        return Rombel;
    }

    public void setRombel(String rombel) {
        Rombel = rombel;
    }

    public String getNIS() {
        return NIS;
    }

    public void setNIS(String NIS) {
        this.NIS = NIS;
    }
}
