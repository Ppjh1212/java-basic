package com.helloshop.order;
import com.helloshop.product.Product;
import com.helloshop.user.User;
public class OrderService {
    public void order() {
        User user = new User(); //유저Id, 이름
        Product product = new Product(); //제품Id, 가격
        Order order = new Order(user, product);
    }
}