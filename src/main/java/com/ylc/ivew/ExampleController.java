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
}
