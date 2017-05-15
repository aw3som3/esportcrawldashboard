package com.dotastat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by sinichiKuda on 5/9/2017.
 */
@Controller
public class CrawlController {
    @RequestMapping("/crawl")
    String crawl (Model model) {
        model.addAttribute("test", "1");
        return "crawl";
    }
}
