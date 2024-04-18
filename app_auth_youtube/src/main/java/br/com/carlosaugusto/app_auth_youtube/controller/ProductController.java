package br.com.carlosaugusto.app_auth_youtube.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
@RequestMapping("/products")
public class ProductController {

  public String getMethodName(@RequestParam String param) {
    return new String();
  }

  @GetMapping("/")
  public String list() {
    return "";
  }

  @PostMapping("/")
  public String create() {
    return "";
  }

}
