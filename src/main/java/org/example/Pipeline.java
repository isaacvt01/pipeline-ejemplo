package org.example;

import java.util.*;

public class Pipeline {
    public static void main(String[] args) {
        List<Integer> data = new ArrayList();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);

        // Etapa 1: Duplicar los números
        List<Integer> stage1Result = new ArrayList();
        for (Integer number : data) {
            stage1Result.add(number * 2);
        }

        // Etapa 2: Sumar 3 a los números
        List<Integer> stage2Result = new ArrayList();
        for (Integer number : stage1Result) {
            stage2Result.add(number + 3);
        }

        // Etapa 3: Calcular la suma final
        int sum = 0;
        for (Integer number : stage2Result) {
            sum += number;
        }

        System.out.println("Resultado final: " + sum);
    }
}