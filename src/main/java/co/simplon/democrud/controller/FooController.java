package co.simplon.democrud.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import co.simplon.democrud.model.Foo;

import org.springframework.http.HttpStatus;

@Controller
@RequestMapping("/foos")
public class FooController {

	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public List<Foo> findAll() {
		List<Foo> foo = new ArrayList<Foo>();
		foo.add(new Foo(1L, "AZERTY"));
		foo.add(new Foo(2L, "Edwin"));
		foo.add(new Foo(3L, "Picolette"));
		// return new ArrayList<Foo>();
		return foo;
	}

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@ResponseBody
	public Long create(@RequestBody Foo resource) {
		System.out.println(resource);
		return 1L;
	}

}
