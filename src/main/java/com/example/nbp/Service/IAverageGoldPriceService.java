package com.example.nbp.Service;

import com.example.nbp.Model.AverageGoldPrice;
import com.mashape.unirest.http.exceptions.UnirestException;

public interface IAverageGoldPriceService {

    AverageGoldPrice getAverageGoldPrice() throws UnirestException;
}
