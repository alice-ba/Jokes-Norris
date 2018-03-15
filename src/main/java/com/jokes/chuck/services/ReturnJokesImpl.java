package com.jokes.chuck.services;

import org.springframework.stereotype.Service;
import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class ReturnJokesImpl implements ReturnJokes {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public ReturnJokesImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }


    @Override
    public String getJokes() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
