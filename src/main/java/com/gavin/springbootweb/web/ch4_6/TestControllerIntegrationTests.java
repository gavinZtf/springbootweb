package com.gavin.springbootweb.web.ch4_6;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.gavin.springbootweb.MyMvcConfig;
import com.gavin.springbootweb.service.DemoService;

/**
 * @author Gavin
 * @date 2018年7月9日
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = MyMvcConfig.class)
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTests {

    private MockMvc mockMvc;
    
    @Autowired
    private DemoService demoService;
    
    @Autowired
    WebApplicationContext wac;
    
    @Autowired
    MockHttpSession session;
    
    @Autowired
    MockHttpServletRequest request;
    
    @Before
    public void setUp(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }
}
