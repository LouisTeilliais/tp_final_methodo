package com.sip.DemoMVCController;

import static org.hamcrest.CoreMatchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest
public class TestDemoMVCController 
{
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void Test_displayMessage() throws Exception
	{      
		this.mockMvc.perform(get("/")).andExpect(status().isOk())
        .andExpect(content().string(containsString("Hello Ynov")));
	}
	
}
