package com.ylc.ivew;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: tree
 * @version: 1.0
 * date: 2018/1/21 16:33
 * @description: xxx
 * own: Aratek
 */
@Controller
public class ExampleController {

    @GetMapping("/")
    public String index() {
        return "test";
    }

    @GetMapping("/example1")
    public String example1() {
        return "example/example1";
    }

    @GetMapping("/layout")
    public String layout() {
        return "example/layout";
    }

    @GetMapping("/layout1")
    public String layout1() {
        return "example/layout1";
    }

    @GetMapping("/layout2")
    public String layout2() {
        return "example/layout2";
    }

    @GetMapping("/grid")
    public String grid() {
        return "example/grid";
    }

    @GetMapping("/button")
    public String button() {
        return "example/button";
    }

    @GetMapping("/icon")
    public String icon() {
        return "example/icon";
    }

    @GetMapping("/input")
    public String input() {
        return "example/input";
    }

    @GetMapping("/table")
    public String table() {
        return "example/table";
    }

    @GetMapping("/login")
    public String login() {
        return "example/login";
    }

    @GetMapping("/main")
    public String main() {
        return "example/main";
    }

    @GetMapping("/main1")
    public String main1() {
        return "example/main1";
    }
}
