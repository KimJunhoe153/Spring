package dw.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "OrderDetail")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "주문세부번호")
    private long orderDetailId;
    @Column(name = "order", length = 255)
    private String order;
    @Column(name = "product", length = 255)
    private String product;
    @Column(name = "unit_price", length = 255)
    private int unitPrice;
    @Column(name = "order_quantity", length = 255)
    private int orderQuantity;
    @Column(name = "discount_rate", length = 255)
    private int discountRate;

    public OrderDetail() {
        super();
    }

    public OrderDetail(long id, long orderDetailId, String order, String product,
                       int unitPrice, int orderQuantity, int discountRate) {
        this.id = id;
        this.orderDetailId = orderDetailId;
        this.order = order;
        this.product = product;
        this.unitPrice = unitPrice;
        this.orderQuantity = orderQuantity;
        this.discountRate = discountRate;
    }
}
