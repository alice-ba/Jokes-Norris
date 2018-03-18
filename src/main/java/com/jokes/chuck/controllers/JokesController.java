package com.jokes.chuck.controllers;


import com.jokes.chuck.services.ReturnJokes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class JokesController {

    private ReturnJokes returnJokes;

    @Autowired
    public JokesController( ReturnJokes returnJokes) {
        this.returnJokes = returnJokes;
    }


    @RequestMapping( {"/",""})
    public String getJokeText(Model model){

        model.addAttribute("joke", returnJokes.getJokes());

        return "chucknorris";
    }
}
