package com.helloshop.order;

import com.helloshop.product.Product;
import com.helloshop.user.User;

public class Order {
    User user; //어떤 사용자가 주문했는지 유제에 대한 정보
    Product product; //사용자가 어떤 제품을 주문했는지 제품에 대한 정보


    public Order(User user, Product product){ //어떤 사용자가 어떤 제품을 주문했는지
        this.user = user;
        this.product = product;
    }
}