package com.example.nbp.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Objects;

public class AverageGoldPrice {

    @JsonIgnore
    private Long id;
    private String firstDate;
    private String lastDate;
    private double averageGoldPriceService;

    public AverageGoldPrice(Long id, double averageGoldPriceService) {
        this.id = id;
        this.averageGoldPriceService = averageGoldPriceService;
    }

    public AverageGoldPrice(Long id, String firstDate, String lastDate, double averageGoldPriceService) {
        this.id = id;
        this.firstDate = firstDate;
        this.lastDate = lastDate;
        this.averageGoldPriceService = averageGoldPriceService;
    }

    public String getFirstDate() {
        return firstDate;
    }

    public void setFirstDate(String firstDate) {
        this.firstDate = firstDate;
    }

    public String getLastDate() {
        return lastDate;
    }

    public void setLastDate(String lastDate) {
        this.lastDate = lastDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getGoldPrice() {
        return averageGoldPriceService;
    }

    public void setGoldPrice(double averageGoldPriceService) {
        this.averageGoldPriceService = averageGoldPriceService;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AverageGoldPrice that = (AverageGoldPrice) o;
        return Double.compare(that.averageGoldPriceService, averageGoldPriceService) == 0 && Objects.equals(id, that.id) && Objects.equals(firstDate, that.firstDate) && Objects.equals(lastDate, that.lastDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstDate, lastDate, averageGoldPriceService);
    }

    @Override
    public String toString() {
        return "AverageGoldPrice{" +
                "id=" + id +
                ", firstDate='" + firstDate + '\'' +
                ", lastDate='" + lastDate + '\'' +
                ", averageGoldPriceService=" + averageGoldPriceService +
                '}';
    }
}
