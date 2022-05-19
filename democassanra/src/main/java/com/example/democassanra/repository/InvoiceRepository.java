package com.example.democassanra.repository;

import java.util.List;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import com.example.democassanra.entity.Invoice;

public interface InvoiceRepository extends CassandraRepository<Invoice, Integer> {

//Like other Database Repositories, some commonly used methods are already provided by CassandraRepository.
//Hence, we don't need to write those here. We can write custom methods. 
//For example, below method is a custom method. 
@AllowFiltering
List<Invoice> findByName(String name);
}