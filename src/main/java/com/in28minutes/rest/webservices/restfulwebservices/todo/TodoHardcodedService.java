package com.in28minutes.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {

	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter=0;
	static {
		todos.add(new Todo(++idCounter,"in28minutes","Learn to dance",new Date(),false));
		todos.add(new Todo(++idCounter,"in28minutes","Learn about Microservice",new Date(),false));
		todos.add(new Todo(++idCounter,"in28minutes","Learn Angular",new Date(),false));
	}
	
	public List<Todo> findAll(){
		return todos;
	}
	
	public Todo deleteById(long id) {
		Todo todo = findById(id);
		if(todo==null)
			return null;
		if(todos.remove(todo))
			return todo;
		return null;
	}
	
	private Todo findById(long id){
		for(Todo t:todos) {
			if(t.getId() == id)
				return t;
		}
		return null;
	}
}
