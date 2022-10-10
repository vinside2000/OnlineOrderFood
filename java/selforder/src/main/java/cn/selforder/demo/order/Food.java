package cn.selforder.demo.order;

import lombok.Data;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Food")
public class Food {

    @Id
    @Column(name = "teaid")
    private String foodId;

    @Column(name = "foodname")
    private String FoodName;
    private String Attribute;
    private String Photo;
    private int count = 0;
    private int Price;
}
