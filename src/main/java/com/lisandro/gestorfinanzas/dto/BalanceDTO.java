package com.lisandro.gestorfinanzas.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BalanceDTO {
    private Long id;
    private double ars;
    private double dolares;
    private List<StockDTO> stockList;
}
