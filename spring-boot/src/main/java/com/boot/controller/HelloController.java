package com.boot.controller;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author guofei
 * @date 2022/5/7 2:30 PM
 */
@Controller
public class HelloController {

  @GetMapping("/hello")
  public String test(){
    return "hello1";
  }

}
