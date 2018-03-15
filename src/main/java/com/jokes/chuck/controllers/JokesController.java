package com.jokes.chuck.controllers;

import com.jokes.chuck.services.ReturnJokes;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;


@Controller
public class JokesController {

    private ReturnJokes returnJokes;

    public JokesController(@Qualifier("returnJokesImpl") ReturnJokes returnJokes) {
        this.returnJokes = returnJokes;
    }

    public String giveJokes() {
        return returnJokes.getJokes();
    }
}
