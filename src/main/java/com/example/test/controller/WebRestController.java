package com.example.test.controller;

import lombok.AllArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

/**
 * @author Lee Taesung
 * @since 2022/10/07
 */

@RestController
@AllArgsConstructor
public class WebRestController {
    private Environment env;

    @GetMapping("/spring-profile")
    public String profile() {
        return Arrays.stream(env.getActiveProfiles())
                .findFirst()
                .orElse("");
    }
}
