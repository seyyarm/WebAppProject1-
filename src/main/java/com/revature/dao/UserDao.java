package com.revature.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Set;

import com.revature.models.QueryBuilder;
import com.revature.models.User;
import com.revature.services.ExecutorService;
import com.revature.util.ConnectionFactory;

public class UserDao implements UserDaoInterface{

	
	
	@Override
	public void createUser(User insertUser) throws SQLException{
		
		Connection connection = ConnectionFactory.getConnection();
		QueryBuilder queryBuilder = new QueryBuilder();
		ExecutorService exec = new ExecutorService(connection);
		
		String insertQuery = queryBuilder.insert(insertUser, "users");
		Object newUser = exec.insert(insertUser, insertQuery);
		System.out.println(newUser);
		
	}

	@Override
	public Set<User> getAllUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void readUsername(String username) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existingUser(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
