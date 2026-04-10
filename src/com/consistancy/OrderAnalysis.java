package com.consistancy;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OrderAnalysis {

    public static void main(String[] args) {

        List<Order> orders = Arrays.asList(new Order("p1", 10, 15.50),
                new Order("p2", 5, 20.50),
                new Order("p1", 7, 15.50),
                new Order("p3", 3, 10.00),
                new Order("p1", 4, 15.50));

        //Total revenue for the product ::

        double sum = orders.stream().filter(p -> p.getProductId().equals("p1")).
                mapToDouble(order -> order.getPrice() * order.getQuality()).sum();
        System.out.println(sum);

        //Average quantity order for the product ::

        Double avgQuality = orders.stream().filter(p -> p.getProductId().equalsIgnoreCase("p1")).
                collect(Collectors.averagingInt(Order::getQuality));
        System.out.println(avgQuality);



    }
}
