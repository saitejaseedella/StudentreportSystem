package com.studentreport.system;

import com.studentreport.system.model.Product;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class ElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(ElasticApplication.class, args);
		System.out.println("Application Started!!!!");

		/*Product product = new Product();
		product.setId("55");
		product.setMaths(5);
		product.setScience(10);
		product.setEnglish(15);
		product.setName("saii");
		product.setAverage();

		int avg= product.getAverage();
*/
	}

}
