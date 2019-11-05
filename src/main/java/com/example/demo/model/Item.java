package com.example.demo.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
@Data
public class Item implements Serializable {
    @Id
    private String itemId;
    private String name;
    private Date expirationDate;
    private String category;
}
