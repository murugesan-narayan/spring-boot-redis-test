package com.muru.redis.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Employee implements Serializable {
    private static final long serialVersionUID = 12355L;

    private String id;
    private String name;
    private int age;
    private Double salary;
}
