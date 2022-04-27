package com.book.SecretBookshelf;

import com.book.SecretBookshelf.postgresqltest.PostgreSQLRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
public class SecretBookshelfApplication {

	public static void main(String[] args) {
		String url = "jdbc:postgresql://localhost:5432/bookshelf";
		String user = "kimeeji";
		String password = "postgres"; //password 입력
		try
		{
			Connection connect = null;
			connect = DriverManager.getConnection(url, user, password);
			if(connect != null) {
				System.out.println("Connection successful!!");
			}
			else {
				throw new SQLException("no connection...");
			}
		} catch (SQLException ex) {
			//throw new RuntimeException();
		}
		SpringApplication.run(SecretBookshelfApplication.class, args);
	}

}
