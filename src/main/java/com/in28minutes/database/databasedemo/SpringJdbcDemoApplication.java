package com.in28minutes.database.databasedemo;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import com.in28minutes.database.databasedemo.entity.Person;
import com.in28minutes.database.databasedemo.jdbc.PersonJdbcDao;

//@SpringBootApplication
public class SpringJdbcDemoApplication implements CommandLineRunner {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PersonJdbcDao personJdbcDao;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users --> " + personJdbcDao.findAll());		
		logger.info("Users id  10001 --> " + personJdbcDao.findById(10001));
		logger.info("Deleting  10002 --> Nro of rows deleted - {} " + personJdbcDao.deleteById(10002));
		logger.info("Inserting  10004 --> {} " + personJdbcDao.insert(new Person(10004, "Lucho", "Montalti", new Date())));
		logger.info("Updating  10003 --> {} " + personJdbcDao.update(new Person(10003, "Charly", "Magna", new Date())));
	}

}

