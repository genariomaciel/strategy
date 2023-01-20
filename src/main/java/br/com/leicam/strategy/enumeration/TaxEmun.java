package br.com.leicam.strategy.enumeration;

import lombok.Getter;

@Getter
public enum TaxEmun {
    ISS(1, "ISS"),
    ICMS(2, "ICMS"),
    PIS_COFINS(3, "PIS/COFINS");

    private int id;
    private String name;

    private TaxEmun (int id, String name) {
        this.id = id;
        this.name = name;
    }
}
