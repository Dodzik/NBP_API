package com.example.nbp.Service;

import com.example.nbp.Model.ExchangeRate;
import com.mashape.unirest.http.exceptions.UnirestException;

import java.util.ArrayList;

public interface IExchangeRatesService {
    ArrayList<ExchangeRate> getExchangeRate(String currencyCode) throws UnirestException;
}
