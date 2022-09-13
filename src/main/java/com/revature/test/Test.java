package com.revature.test;

import java.sql.Connection;

import java.sql.SQLException;
import java.sql.Statement;

import com.revature.dao.UserDao;
import com.revature.models.QueryBuilder;
import com.revature.models.User;
import com.revature.services.ExecutorService;
import com.revature.util.ConnectionFactory;



public class Test {

	public static void main(String[] args) throws SQLException {
	/*	Connection c = ConnectionFactory.getConnection();
		String query = "Insert into users(username,password,email) values('pikachu','pikachu','pikachu@email.com')";
		Statement statement = c.createStatement();
		statement.execute(query);
		*/
		Connection connection = ConnectionFactory.getConnection();
		QueryBuilder queryBuilder = new QueryBuilder();
		ExecutorService exec = new ExecutorService(connection);
		
		User insertUser = new User("Evan", "evan", "evan@email.com");
		UserDao uDao = new UserDao();
		uDao.createUser(insertUser);


		
		//String insertQuery = queryBuilder.insert(insertUser, "users");
		//Object newUser = exec.insert(insertUser, insertQuery);
		System.out.println(insertUser);
		
	}

}
