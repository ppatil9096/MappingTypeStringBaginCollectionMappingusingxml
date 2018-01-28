package com.pravin.hibernate;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StoreData {
    public static void main(String[] args) {
	Session session = new Configuration().configure()
		.buildSessionFactory()
		.openSession();
	Transaction transaction = session.beginTransaction();

	ArrayList<String> arrayList1 = new ArrayList<>();
	arrayList1.add("Aahooo!");
	arrayList1.add("Gahooo!");

	Question question1 = new Question();
	question1.setQname("Whats your ambition?");
	question1.setAnswers(arrayList1);

	session.persist(question1);
	transaction.commit();
	session.close();
	System.out.println("Success!");
    }
}
