package com.ujs.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

  @GetMapping("/")
  public String getHellowWord(){
    return "Hi, Your springboot is working....";
  }
}
