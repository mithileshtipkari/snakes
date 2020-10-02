/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.games.Snakes.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author mith1
 */
@RestController
public class SnakeController {
    @GetMapping("/index")
    public ModelAndView showIndexPage(){
        System.out.println("index");
        ModelAndView mav = new ModelAndView();
        mav.addObject("name", "mithilesh");
        mav.setViewName("index");
        return mav;
    }
}
