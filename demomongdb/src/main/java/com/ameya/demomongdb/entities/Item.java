package com.ameya.demomongdb.entities;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("buy")
public class Item {

    @Id
    @Getter
    @Setter
    private String id;

    @Getter @Setter
    private String itemName;

    @Getter @Setter
    private String seller;

    @Getter @Setter
    private int quantityAvailable;

    public Item(String itemName, String seller, int quantityAvailable) {
        this.itemName = itemName;
        this.seller = seller;
        this.quantityAvailable =quantityAvailable;
    }

    @Override
    public String toString() {
        return "{itemName : " +itemName + ";\nseller : " + seller + ";\n quantityAvailable" + quantityAvailable+ "}\n";
    }

}
