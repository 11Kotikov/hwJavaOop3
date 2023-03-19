package org.homework;

import org.homework.drugs.Component;
import org.homework.drugs.Drug;
import org.homework.drugs.impl.CatDrug;
import org.homework.drugs.impl.components.Azitron;
import org.homework.drugs.impl.components.Pinecilin;
import org.homework.drugs.impl.components.Water;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // списик по порядку

        List<Component> componentsCat1 = List.of(new Azitron("Азитрон", "2", 4),
                new Water("Вода", "15", 1));

        List<Component> componentCat2 = List.of(new Azitron("Азитрон", "4", 4),
                new Pinecilin("Пинециллин", "18", 6));

        List<Component> componentCat3 = List.of(new Water("Вода", "20", 12),
                new Azitron("Азитрон", "10", 9));

        List<Component> componentCat4 = List.of(new Water("Вода", "20", 12),
                new Azitron("Пенициллин", "10", 100));

        List<Component> componentCat5 = List.of(new Pinecilin("Пенициллин", "5", 12),
                new Water("Солёная вода", "10", 100));

        CatDrug drug1 = new CatDrug(componentsCat1);
        CatDrug drug2 = new CatDrug(componentCat2);
        CatDrug drug3 = new CatDrug(componentCat3);
        CatDrug drug4 = new CatDrug(componentCat4);
        CatDrug drug5 = new CatDrug(componentCat5);


        List<CatDrug> drugs = new ArrayList<>();
        drugs.add(drug1);
        drugs.add(drug2);
        drugs.add(drug3);
        drugs.add(drug4);
        drugs.add(drug5);

        Collections.sort(drugs);
        System.out.println(drugs);

        //Сет + сет с перегрузкой equals и hashCode
        Component penicillin = new Component("Пенициллин", "20", 10);
        Component penicillin2 = new Component("Пенициллин", "20", 10);
        Component azitron1 = new Component("Азитрон", "2", 14);
        Component water1 = new Component("Вода", "33", 2);
        Component water2 = new Component("Солёная Вода", "20", 12);
        Component water3 = new Component("Морская Вода", "20", 12);

        List<Component> someComponentsAbove = new ArrayList<>();
        someComponentsAbove.add(penicillin);
        someComponentsAbove.add(penicillin2);
        someComponentsAbove.add(azitron1);
        someComponentsAbove.add(water1);
        someComponentsAbove.add(water2);
        someComponentsAbove.add(water3);


        Set<Component> result = new HashSet<>(someComponentsAbove);

        System.out.println(result);
        System.out.format("size: " + result.size());
    }
}