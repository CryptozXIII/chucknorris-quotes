package de.htwberlin.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuotesServiceImp implements QuotesService{

    List<String> quotes = QUOTES.stream().collect(Collectors.toList());
    @Override
    public String getQuote(int index) {
        if(index>quotes.size()||index<0){
            throw new IllegalArgumentException("invalid index");
        }
        return quotes.get(index);
    }
}
