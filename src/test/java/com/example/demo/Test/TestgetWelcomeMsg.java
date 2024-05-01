package com.example.demo.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.example.demo.rest.WelcomeRestController;
import com.example.demo.service.WelcomeService;

@WebMvcTest(value =WelcomeRestController.class)
public class TestgetWelcomeMsg  {
	@MockBean
	private WelcomeService service;
	@Autowired
	private MockMvc mvc;
	@Test
	public void Tesgetwelcomemsg() throws Exception
	{
		when(service.getmsg()).thenReturn("Welcome to hell");
MockHttpServletRequestBuilder req=MockMvcRequestBuilders.get("/welcome");
MvcResult result = mvc.perform(req).andReturn();
MockHttpServletResponse response = result.getResponse();
int status = response.getStatus();
assertEquals(200, status);
	}
	WelcomeService ser=new WelcomeService();
	@Test
	public void Testwel()
	{
		String msg = ser.getmsg();
		
		assertEquals("Welcome lionel", msg);
	
}
	
}
