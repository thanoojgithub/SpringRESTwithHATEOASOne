package com.spring.pojo;

import java.util.Set;

import org.springframework.hateoas.ResourceSupport;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @JsonCreator - signal on how Jackson can create an instance of this POJO
 * @JsonProperty - clearly marks what field Jackson should put this constructor
 *               argument into
 * 
 * @author thanooj.kalathuru
 *
 */
public class Response extends ResourceSupport {

	private final Set<Person> content;

	@JsonCreator
	public Response(@JsonProperty("content") Set<Person> persons) {
		this.content = persons;
	}

	public Set<Person> getContent() {
		return content;
	}
}
