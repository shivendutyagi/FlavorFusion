package com.foodies.dto.response;

import com.foodies.model.FoodItem;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.List;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartResponse {

    int cartTotal;

    List<FoodItem> foodItems;
}
