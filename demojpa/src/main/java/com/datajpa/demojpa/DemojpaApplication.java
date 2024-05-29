package com.datajpa.demojpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
//@ComponentScan({"com.datajpa.demojpa", "Dao"})
public class DemojpaApplication {

	public static void main(String[] args)
	{

		ApplicationContext context=SpringApplication.run(DemojpaApplication.class, args);
		UserRepo userRepo=context.getBean(UserRepo.class);
		User user1=new User();
		user1.setName("Sanket");
		user1.setCity("Katraj");
		user1.setStatus("I am team management");

		User user2=new User();
		user2.setName("Pratik");
		user2.setCity("Mule");
		user2.setStatus("I am FIR Project management");

		////saving single user
//		User user1= (User) userRepo.save(user);
//		System.out.println(user1);


		//////when need to use multiple object
//		List<User> users= List.of(user1,user2);
//		List<User> savedUsers = userRepo.saveAll(users);
//		savedUsers.forEach(user -> {
//			System.out.println(user);
//		});



////// get single
//		Optional<User> optional=userRepo.findById(52);
//		User userToget=optional.get();
//		System.out.println(userToget);


		////// get All
//		Optional<User> optional=userRepo.findById(52);
//		List<User> itr=userRepo.findAll();
//		itr.forEach(user-> System.out.println(user));


		//////update
//	User userToUpdate=users.get(0);
//	userToUpdate.setCity("Goa");
//	userToUpdate.setName("Manish");
//
//	userRepo.save(userToUpdate);
//		System.out.println(userToUpdate);

////////update
//		Optional<User> optional=userRepo.findById(52);
//		User userToUpdate=optional.get();
//		userToUpdate.setCity("Goa");
//		userToUpdate.setName("Manish");
//
//		userRepo.save(userToUpdate);
//		System.out.println(userToUpdate);


		//////delete

		//int idd=152;
		userRepo.deleteById(103);
		System.out.println("deleted");









	}








}
//entity-userrepo-application.properties-main class got application context
//
//