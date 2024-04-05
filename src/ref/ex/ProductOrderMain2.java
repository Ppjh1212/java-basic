package ref.ex;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        ProductOrder order1 = createOrder("두부", 2000, 2); //x001
        ProductOrder order2 = createOrder("김치", 5000, 1); //x002
        ProductOrder order3 = createOrder("콜라", 1500, 2); //x003

        ProductOrder[] orders = {order1, order2, order3};

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
        System.out.println("총 결제 금액: " + totalAmount);
    }

    static ProductOrder createOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder orderPrint : orders) {
            System.out.println("상품명: " + orderPrint.productName + ", 가격: " + orderPrint.price + ", 수량: " + orderPrint.quantity);
        }
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder orderTotal : orders) {
            totalAmount += orderTotal.price * orderTotal.quantity;
       }
        return totalAmount;
    }
}
