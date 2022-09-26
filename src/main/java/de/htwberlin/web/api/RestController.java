package de.htwberlin.web.api;


import de.htwberlin.service.QuotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    QuotesService service;

    public RestController(){}

    @GetMapping("/api/v1/quotes")
    public QuoteResponse getQuote(@RequestParam int index){
        return new QuoteResponse(service.getQuote(index));
    }
}
