package xiaoming.serviceribbon;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

//import javax.ws.rs.core.MediaType;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class ServiceRibbonApplicationTests {

	private MockMvc mvc;

//	@Before
//	public void setUp() throws Exception {
//		mvc = MockMvcBuilders.standaloneSetup(new HelloController()).build();
//	}

//	@Test
//	public void getHello() throws Exception {
//		mvc.perform(MockMvcRequestBuilders.get("/hi?name=forezp").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("hi forezp ,i am from port:8762")));
//	}


	@Autowired
	WebApplicationContext wac;

	public MockMvc mvc2;

	@Before
	public void setUp2() throws Exception {
		mvc2 = MockMvcBuilders.webAppContextSetup(wac).build();
	}


	@Test
	public void getHello2() throws Exception {
		RequestBuilder request = null;
		request = get("/hi").param("name","forezp");

		MvcResult result = mvc2.perform(request).andExpect(status().isOk()).andReturn();
//		mvc.perform(get("/hi?name=forezp").accept(MediaType.APPLICATION_JSON))
//				.andExpect(status().isOk())
//				.andExpect(content().string(equalTo("hi forezp ,i am from port:8762")));
//		while (true) {
//
//		}
	}

}
