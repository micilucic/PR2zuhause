package com.company;

import java.util.Arrays;

public class Order {
private int nrArticles;
private int capacityOrder;
private Article [] articles;

public Order (int capacityOrder) {
    this.nrArticles = 0;
    this.capacityOrder = capacityOrder;
    articles = new Article[capacityOrder];
}

    public int getNrArticles() {
        return nrArticles;
    }

    public int getCapacityOrder() {
        return capacityOrder;
    }

    @Override
    public String toString() {
        return "Order{" +
                "articles=" + Arrays.toString(articles) +
                '}';
    }
    public void addArticle (Article a) {
    for (int i = 0; i <= articles.length; i++) {
        articles[i] = a;
        }
    }
    public int findMostExpensiveArticle () {
    int position = 0;

    for (int i = 0; i < articles.length; i++) {
        if (articles[i].getPrice() >= articles[position].getPrice()) {
            position = i + 1;
        }
    } return position;
    }
    public int findMostExpensiveOrderPosition() {
    int position = 0;
    for (int i = 0; i < articles.length; i++) {
        if (articles[i].getPrice()* (articles[i].getNumber()) > articles[position].getPrice() * (articles[position].getNumber())) {
            position = i+1;
        }
    } return position;
    }
    public double sumOrder() {
    double sum = 0;
   // for (int i = 0; i < articles.length; i++) {
     //   sum = sum + (articles[i].getPrice() * articles[i].getNumber());
    // }
    // return sum;
        for (Article a : articles) {
            sum = sum + (a.getPrice() * a.getNumber());
        } return sum;
        }

    public double calculateTax() {
    double tax = 0;
   /* for (int i = 0; i < articles.length; i++) {
        if (articles[i].getPrice() < 20) {
            tax = tax + (articles[i].getPrice() * 0.05);
        } else {
            tax = tax + (articles[i].getPrice() * 0.2);
        }
   } return tax;
   */
        for (Article a : articles) {
            if (a.getPrice() < 20) {
                tax += (a.getPrice() * 0.05);
            } else {
                tax += (a.getPrice() * 0.2);
            }
        }
        return tax;
}
    public double sumOrderWithTax () {
    double sum = 0;
    for (Article a : articles) {
        sum += 
    }
    }
}
