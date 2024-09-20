package com.mcsv.order.dtos.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderCreateDTO {

    private String itemType;
    private BigDecimal price;
    private String currency;

}
