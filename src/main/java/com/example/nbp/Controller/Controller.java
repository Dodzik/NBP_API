package com.example.nbp.Controller;


import com.example.nbp.Model.AverageGoldPrice;
import com.example.nbp.Model.ExchangeRate;
import com.example.nbp.Service.IAverageGoldPriceService;
import com.example.nbp.Service.IExchangeRatesService;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
public class Controller {

    @Autowired
    private IAverageGoldPriceService averageGoldPriceService;

    @Autowired
    private IExchangeRatesService exchangeRatesService;

    @GetMapping("/api/gold-price/average")
    public AverageGoldPrice getAverageGoldPrice() throws UnirestException {

        return averageGoldPriceService.getAverageGoldPrice();
    }

    @GetMapping("/api/exchange-rates/{currencyCode}")
    public ArrayList<ExchangeRate> getExchangeRate(@PathVariable String currencyCode) throws UnirestException {
        return exchangeRatesService.getExchangeRate(currencyCode);
    }
}
