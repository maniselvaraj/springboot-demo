package com.mani.llm.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LLMMainController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot Test Project for LLM refactoring!";
	}


	@GetMapping("/v1/unique_string/{my_string}")
	public Boolean checkIfStringHasUniqueCharacters(@PathVariable("my_string") String str ){
		for (int i = 0; i < str.length(); i++) {
			for (int j = 0; j < str.length(); j++) {
				if (i != j && str.charAt(i) == str.charAt(j)) {
					return false;
				}
			}
		}
		return true;
	}




}
