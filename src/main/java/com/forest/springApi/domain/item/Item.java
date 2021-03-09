package com.forest.springApi.domain.item;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
public abstract class Item {
    @Id
    @GeneratedValue
    @Column(name = "item_id")
    private Long id;

    private String name;

    private int price;

    private int stock_quantity;

    @ManyToMany
    @JoinTable(name = "category_item") // 실전에서 쓰지 않는
    private List<Category> categories= new ArrayList<>();

}
