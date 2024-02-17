package org.example;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


public class Calculator {
    public Object calc(List<?> numbers) {
        int sum = 0;
        for (Object number : numbers) {
            if (number instanceof String) {
                Integer.parseInt((String) number);
                sum += Integer.parseInt((String) number);
            }
            if (number instanceof Number) {
                sum += ((Number) number).doubleValue();
            }
        }
        return Integer.toBinaryString(sum);
    }

    public Object calcUmn(List<?> numbers) {
        int umn = 1;
        for (Object number : numbers) {
            if (number instanceof String) {
                Integer.parseInt((String) number);
                umn *= Integer.parseInt((String) number);
            }
            if (number instanceof Number) {
                umn *= ((Number) number).doubleValue();

            }
        }
        return Integer.toBinaryString(umn);
    }


}
