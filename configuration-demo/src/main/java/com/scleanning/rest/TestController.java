package com.scleanning.rest;

import com.scleanning.config.MailProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * Created by vincent on 17-7-8.
 */
@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private MailProperties mailProperties;

    @ResponseBody
    @RequestMapping(value = "/{serviceName}", method = RequestMethod.GET)
    public String getUserNameAndPw(@PathVariable("serviceName")final String serviceName){
        return "userName is: " + mailProperties.getUsername().get(serviceName)
                +", password is: " + mailProperties.getPassword().get(serviceName);
    }
}
