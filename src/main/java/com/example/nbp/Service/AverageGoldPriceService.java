package com.example.nbp.Service;

import com.example.nbp.Model.AverageGoldPrice;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.springframework.stereotype.Service;

@Service
public class AverageGoldPriceService implements IAverageGoldPriceService {

    public AverageGoldPrice getAverageGoldPrice() throws UnirestException {

        String httpQuetry = "http://api.nbp.pl/api/cenyzlota/last/14";
        HttpResponse<JsonNode> response = Unirest.get(httpQuetry)
                .asJson();
        JSONArray jsonArray = response.getBody().getArray();
        double sum = 0.0;
        for (int i = 0; i < jsonArray.length(); i++) {
            sum += jsonArray.getJSONObject(i).getDouble("cena");
        }
        return new AverageGoldPrice(1L, jsonArray.getJSONObject(0).getString("data"),jsonArray.getJSONObject(jsonArray.length()-1).getString("data"),sum / jsonArray.length());
    }
}
