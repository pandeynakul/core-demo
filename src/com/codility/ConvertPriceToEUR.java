package com.codility;

import java.math.BigDecimal;
import java.util.stream.Stream;

public class ConvertPriceToEUR {

    public static void main(String[] args) {
        Stream<SoldProduct> soldProductStream = Stream.of(new SoldProduct("apple", new BigDecimal(12.3), "USD"),
                new SoldProduct("shaw", new BigDecimal(13.3), "USD"),
                new SoldProduct("wallet", new BigDecimal(14.3), "USD"),
                new SoldProduct("mobile", new BigDecimal(15.3), "USD"),
                new SoldProduct("chain", new BigDecimal(16.3), "USD"));
        EURExchangeService eurExchangeService  =new EURExchangeService();
        eurExchangeService.rate("EUR");

        SoldProductsAggregator soldProductsAggregator=new SoldProductsAggregator(eurExchangeService);

        SoldProductsAggregate soldProductsAggregate = soldProductsAggregator.aggregate(soldProductStream);
       // System.out.println(soldProductsAggregate.getProducts());
        SoldProductsAggregate aggregate=new SoldProductsAggregate(soldProductsAggregate.getProducts(),soldProductsAggregate.getTotal());
        System.out.println(aggregate.getProducts()+" : "+aggregate.getTotal());
    }
}
