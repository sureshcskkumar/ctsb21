package com.demo;

import java.util.List;

import com.demo.entities.Movie;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;



@SpringBootTest
@AutoConfigureMockMvc
class ControllerTest {

	// private RestTemplate template = new RestTemplate();

	// @Test
	// public void shouldFindAllMovies(){
	// ResponseEntity<?> res =
	// template.exchange("http://localhost:8080/api/v1/movies", HttpMethod.GET,
	// null, new ParameterizedTypeReference<List<Movie>>() {});

	// System.out.println(res.getBody());
	// System.out.println(res.getStatusCode());
	// }

	@Autowired
	private MockMvc mockMvc;

	@Test
	public void shouldReturnMovies() throws Exception {
		this.mockMvc.perform(get("/api/v1/movies"))
			.andDo(print())
			.andExpect(
				status()
				.isOk()
			);
			// .andExpect(
			// 	content().string(containsString("Hello, World"))
			// );
	}
}
