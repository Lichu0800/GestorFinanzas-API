package com.lisandro.gestorfinanzas.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Balance {
    private Long id;
    private double ars;
    private double dolares;

}
