package com.foodies.transformer;

import com.foodies.dto.response.CartResponse;
import com.foodies.model.Cart;

import java.util.ArrayList;

public class CartTransformer {

    public static CartResponse CartToCartResponse(Cart cart){

        return CartResponse.builder()
                .cartTotal(cart.getCartTotal())
                .foodItems(new ArrayList<>())
                .build();
    }
}
