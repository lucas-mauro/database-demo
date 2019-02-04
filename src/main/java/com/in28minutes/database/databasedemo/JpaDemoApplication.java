package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jpa.PersonJpaRepository;

@SpringBootApplication
public class JpaDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonJpaRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(JpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
				
		logger.info("Users id  10001 --> " + repository.findById(10001));
		logger.info("Inserting  10004 --> {} " + repository.insert(new Person(10004, "Lucho", "Montalti", new Date())));
		logger.info("Updating  10003 --> {} " + repository.update(new Person(10003, "Charly", "Magna", new Date())));
		repository.deleteById(10002);
		/*
		logger.info("All users --> " + repository.findAll());
		logger.info("Deleting  10002 --> Nro of rows deleted - {} " + personJdbcDao.deleteById(10002));
		logger.info("Inserting  10004 --> {} " + personJdbcDao.insert(new Person(10004, "Lucho", "Montalti", new Date())));
		logger.info("Updating  10003 --> {} " + personJdbcDao.update(new Person(10003, "Charly", "Magna", new Date())));
		*/
	} 

}

