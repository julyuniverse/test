package com.example.test.controller;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Lee Taesung
 * @since 2022/10/07
 */

@RestController
@RequiredArgsConstructor
@AllArgsConstructor
public class HelloController {
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        String str = "hello";

        return ResponseEntity.ok().body(str);
    }
}
