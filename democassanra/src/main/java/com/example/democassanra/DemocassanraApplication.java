package com.example.democassanra;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.democassanra.entity.Invoice;
import com.example.democassanra.repository.InvoiceRepository;

@SpringBootApplication
public class DemocassanraApplication {
	@Autowired
    InvoiceRepository repo;
	
	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(DemocassanraApplication.class, args);
		InvoiceRepository repo=applicationContext.getBean(InvoiceRepository.class);
		List <Invoice> invoiceList=repo.findAll();
		System.out.print("Number of invoice is -> "+invoiceList.size());
		
	}

}
