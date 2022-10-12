package cn.selforder.demo.order;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Data
@Entity
public class Auxx implements Serializable {

    @Id
    private String FoodName;
    private int Number;
    private String Taste;
    private int Price;
}
