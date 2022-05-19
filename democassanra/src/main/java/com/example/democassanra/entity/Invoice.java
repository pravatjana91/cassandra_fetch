package com.example.democassanra.entity;


import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
// create table invoice(id int primary key, name text, number text, amount double);

@Table //represents that it will map to ‘invoice’ table in Cassandra DB.
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Invoice {

     @PrimaryKey
     private Integer id;
     private String name;
     private String number;
     private Double amount;
}