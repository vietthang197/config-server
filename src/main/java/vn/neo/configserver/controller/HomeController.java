package vn.neo.configserver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author thanglv on 3/9/2022
 * @project config-server
 */
@RestController
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String homePage() {
        return "Cloud config server";
    }
}
