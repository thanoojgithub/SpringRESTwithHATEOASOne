package com.spring.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import java.util.HashSet;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.pojo.Person;
import com.spring.pojo.Response;
import com.spring.util.PersonFactory;
/**
 * https://www.youtube.com/watch?v=NK3HNEwDXUk
 * 
 * @author thanooj.kalathuru
 *
 */
@RestController
public class PersonController {

	@RequestMapping("/personById/{id}")
	public Response getpersonById(@PathVariable(value = "id") int id) {
		HashSet<Person> personById = new HashSet<Person>();
		personById.add(PersonFactory.getPersonById(id));
		Response response = new Response(personById);
		response.add(linkTo(methodOn(PersonController.class).getpersonById(id)).withSelfRel());
		response.add(linkTo(methodOn(PersonController.class).persons()).withRel("/persons"));
		return response;
	}

	@RequestMapping("/personByName/{name}")
	public Response getPersonByName(@PathVariable(value = "name") String name) {
		HashSet<Person> personByName = new HashSet<Person>();
		personByName.add(PersonFactory.getPersonByName(name));
		Response response = new Response(personByName);
		response.add(linkTo(methodOn(PersonController.class).getPersonByName(name)).withSelfRel());
		response.add(linkTo(methodOn(PersonController.class).persons()).withRel("/persons"));
		return response;
	}

	@RequestMapping("/persons")
	public Response persons() {
		Response response = new Response(PersonFactory.getPersons());
		response.add(linkTo(methodOn(PersonController.class).persons()).withSelfRel());
		return response;
	}

}
