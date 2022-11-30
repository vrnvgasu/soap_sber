package ru.edu.controller;

import java.time.LocalDateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.edu.dto.CityInformation;
import ru.edu.dto.HelloResponse;

@RestController
@RequestMapping("/example")
public class MyController {

	@GetMapping("/hello")
	public HelloResponse helloWorld() {
		HelloResponse response = new HelloResponse();
		response.setMessage("Hello, world!");
		return response;
	}

//	@GetMapping("/city")
//	public CityInformation getCityInfo(@RequestParam("id") String cityId) {
	@GetMapping("/city/{id}")
	public CityInformation getCityInfo(@PathVariable("id") String cityId) {
		CityInformation response = new CityInformation();
		response.setCityId(cityId);
		response.setName("Test");
		response.setResponseTime(LocalDateTime.now().toString());

		// actions for HATEOAS - Hypermedia As The Engine Of Application State
		response.setDetailedInfoHref("http://localhost:8080/api/city/detailed?id=" + cityId);
		response.setDeleteHref("http://localhost:8080/api/city/delete?id=" + cityId);

		return response;
	}

}
