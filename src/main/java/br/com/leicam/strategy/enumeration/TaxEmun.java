package br.com.leicam.strategy.enumeration;

import lombok.Getter;

@Getter
public enum TaxEmun {
    ISS(1, "ISS"),
    ICMS(2, "ICMS"),
    PIS_COFINS(3, "PIS/COFINS");

    private int code;
    private String name;

    private TaxEmun (int code, String name) {
        this.code = code;
        this.name = name;
    }
}
