package ru.job4j;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Order {
    @EqualsAndHashCode.Include
    private long id;
    private String name;
    private String descriptions;
    private double price;
    private List<Dish> dishes = new ArrayList<>();
}
