package com.jokes.chuck.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ReturnJokesImpl implements ReturnJokes {

    private String jokes = new ChuckNorrisQuotes().getRandomQuote();

    @Override
    public String getJokes() {
        return jokes;
    }
}
