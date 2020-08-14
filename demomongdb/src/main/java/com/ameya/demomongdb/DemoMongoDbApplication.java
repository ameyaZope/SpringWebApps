package com.ameya.demomongdb;

import com.ameya.demomongdb.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoMongoDbApplication {

	@Autowired
	public static ItemRepository itemRepository;

	public static void main(String[] args) {
		//itemRepository.save(new Item("2123asd","HardDisk","Sandisk",101));

		SpringApplication.run(DemoMongoDbApplication.class, args);
	}


}
