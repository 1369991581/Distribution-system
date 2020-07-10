package com.example.springboot1.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Getter
@Setter
public class BasePerson {
    private String username;
    private String password;
    private Integer phoneNumber;
    private AuthorityEnum author;
}
