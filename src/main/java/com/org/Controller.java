/**
 * 
 */
package com.org;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gangeswar Vemula
 *
 */
@RestController
@RequestMapping("/sample/${msVersion:}")
public class Controller {


	@GetMapping(value = "/hello", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String greet() {
		return "{\"name\":\"Spring Boot\"}";
	}

	@GetMapping(value = "/health", produces = { MediaType.APPLICATION_JSON_VALUE })
	public String health() {
		return "{\"status\":\"success\"}";
	}
}
