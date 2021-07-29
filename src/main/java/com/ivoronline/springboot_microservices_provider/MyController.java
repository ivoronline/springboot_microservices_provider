package com.ivoronline.springboot_microservices_provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

  @RequestMapping("Hello")
  String hello() {
    return "Hello from Provider";
  }

}

