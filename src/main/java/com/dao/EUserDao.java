package com.dao;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.EUserBean;

//singleton -> new -> @Autowired 
@Repository
public class EUserDao {

	@Autowired // instance eject
	JdbcTemplate stmt; // update() query()

	public void insertUser(EUserBean userBean) {
		// query ->
//		stmt.update("insert into users(firstName,email,password,profilePicpath) values (?,?,?,?) ", userBean.getFirstName(),
//				userBean.getEmail(), userBean.getPassword(), userBean.getProfilePicPath());
		stmt.update("insert into users(firstName,email,password,profilePicpath) values (?,?,?,?) ", userBean.getFirstName(),
				userBean.getEmail(), userBean.getPassword(),userBean.getProfilePicPath());
	}
	// int
	// boolean
	// EuserBean
	// welcome , Ram
	// addTocart userId

	public EUserBean authenticate(String email, String password) {
		// select * from users where email = ? and password = ?
		try {
			EUserBean userBean = stmt.queryForObject("select * from users where email = ? and password = ?",
					new BeanPropertyRowMapper<>(EUserBean.class), new Object[] { email, password });

			return userBean;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		return null;// invalid
	}
	// query -> select * -> 1+ -> n
	// queryForObject -> select -> 1 record { 0 1+ throw exception}
	// update -> insert update delete

}

//controller -> USerBEan user  -> dao->insertUser(user) 

//dao -> insertUser()

//controller -> USerBEan user  -> dao->insertUser(user) 

//dao -> insertUser()

//when we create a Dao class and we need that class object from the spring then we need to configure that using @Repository annotation.
//For the In-built class we not need to write @Repository there is already mention. for an example like : JdbcTemplate : JdbcTemplate is a class of spring jdbc that is in-built class so we not need to write @Repository .just we need to use whenever we want to create the object of that then we need to use @Autowired:using @Autowired annotation we make the object using singleTon design pattern
//in springBoot project we don't have the any xml file for the configuration
//@Autowired is like : getBean() : to create an object

//@Autowired is use for the create the object using the singleTon design pattern
//jdbcTemplate is nothing but execute the over sql query 
	//jdbcTemplate have 2 methods : query(),update()
	//update () : method is use for the : insert,update and delete
	//query() : method is use for the read the data from the databases
	