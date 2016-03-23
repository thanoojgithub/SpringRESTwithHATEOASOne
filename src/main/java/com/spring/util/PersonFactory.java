package com.spring.util;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.spring.pojo.Person;

public class PersonFactory {

	private static Set<Person> persons = new HashSet<Person>();

	static {
		persons.add(new Person(1, "sriram", new Date(), "ayodhya"));
		persons.add(new Person(2, "seeta", new Date(), "midhila"));
		persons.add(new Person(3, "lakshaman", new Date(), "ayodhya"));
	}

	public static Set<Person> getPersons() {
		return persons;
	}

	public static Person getPersonById(int id) {
		Person personTemp = null;
		for (Person person : persons) {
			if (person.getId() == id) {
				personTemp = person;
			}
		}
		return personTemp;
	}

	public static Person getPersonByName(String name) {
		Person personTemp = null;
		for (Person person : persons) {
			if (person.getName().equals(name)) {
				personTemp = person;
			}
		}
		return personTemp;
	}

}
