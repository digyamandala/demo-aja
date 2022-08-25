package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping(path = "/api/test")
public class TestController {

  @GetMapping
  public Mono<String> test() {
    return Mono.just("Test, nih");
  }
}
