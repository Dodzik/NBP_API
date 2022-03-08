package com.example.nbp.Service;

import com.example.nbp.Model.ExchangeRate;
import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.JsonNode;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
import org.json.JSONArray;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class ExchangeRatesService implements IExchangeRatesService {
    @Override
    public ArrayList<ExchangeRate> getExchangeRate(String currencyCode) throws UnirestException {
        String httpQuery2 = "http://api.nbp.pl/api/exchangerates/tables/a/last/5";

        HttpResponse<JsonNode> response2 = Unirest.get(httpQuery2)
                .asJson();
        ArrayList<ExchangeRate> result = new ArrayList<>();
        int count = 0;
        String myCode = currencyCode;
        JSONArray jsonArray = response2.getBody().getArray();
        String date;
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONArray jsonArray2 = jsonArray.getJSONObject(i).getJSONArray("rates");
            date = jsonArray.getJSONObject(i).getString("effectiveDate");
            for (int j = 0; j < jsonArray2.length(); j++) {
                if (jsonArray2.getJSONObject(j).getString("code").equals(myCode)) {
                    result.add(new ExchangeRate((long) count, jsonArray2.getJSONObject(j).getString("currency"), myCode, jsonArray2.getJSONObject(j).getDouble("mid") + "", date));
                }
            }
        }
        return result;
    }
}
