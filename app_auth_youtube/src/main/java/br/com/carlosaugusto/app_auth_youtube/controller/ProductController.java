package br.com.carlosaugusto.app_auth_youtube.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.access.prepost.PreAuthorize;
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
  @PreAuthorize("hasRole('USER')")
  public String list() {
    return "";
  }

  @PostMapping("/")
  @PreAuthorize("hasRole('ADMIN')")
  public String create() {
    return "";
  }

}
