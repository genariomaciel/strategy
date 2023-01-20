package br.com.leicam.strategy.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Tax {
    private int id;
    private String name;
    private double value;
}
