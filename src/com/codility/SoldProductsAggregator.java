package com.codility;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.*;

public class SoldProductsAggregator {
    private final EURExchangeService exchangeService;

    SoldProductsAggregator(EURExchangeService EURExchangeService) {
        this.exchangeService = EURExchangeService;
    }

    SoldProductsAggregate aggregate(Stream<SoldProduct> products) {

        List<SimpleSoldProduct> product = products.filter(Objects::nonNull).
                map(p -> new SimpleSoldProduct(p.getName(), p.getPrice())).collect(Collectors.toList());

        BigDecimal total = products.filter(o -> o.getPrice().compareTo(BigDecimal.ZERO) < 0)
                .map(p -> exchangeService.rate(p.getCurrency()).orElse(BigDecimal.ZERO).multiply(p.getPrice())).
                        reduce(BigDecimal.ZERO, BigDecimal::add);
        return new SoldProductsAggregate(product,total);






    }


}
