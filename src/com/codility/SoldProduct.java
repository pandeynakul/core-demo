package com.codility;

import lombok.Value;

import java.math.BigDecimal;

@Value
public class SoldProduct {
    String name;
    BigDecimal price;
    String currency;
}
