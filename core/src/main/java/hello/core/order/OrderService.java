package hello.core.order;

public interface OrderService {
    Order createOrder(Long membeerId, String itemName, int itemPrice);
}
