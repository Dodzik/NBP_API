package com.example.nbp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class ExchangeRate {

    @JsonIgnore
    private Long id;

    private String currency;
    private String code;
    private String mid;
    private String date;

    public ExchangeRate(Long id, String currency, String code, String mid, String date) {
        this.id = id;
        this.currency = currency;
        this.code = code;
        this.mid = mid;
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ExchangeRate(Long id, String currency, String code, String mid) {
        this.id = id;
        this.currency = currency;
        this.code = code;
        this.mid = mid;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ExchangeRate that = (ExchangeRate) o;
        return Objects.equals(id, that.id) && Objects.equals(currency, that.currency) && Objects.equals(code, that.code) && Objects.equals(mid, that.mid) && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, currency, code, mid, date);
    }

    @Override
    public String toString() {
        return "ExchangeRate{" +
                "id=" + id +
                ", currency='" + currency + '\'' +
                ", code='" + code + '\'' +
                ", mid='" + mid + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
