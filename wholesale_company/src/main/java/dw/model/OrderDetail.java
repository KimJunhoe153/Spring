package dw.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "주문세부")
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "주문세부번호")
    private long orderDetailId;

    @ManyToOne
    @JoinColumn(name = "주문번호")
    private String order;

    @ManyToOne
    @JoinColumn(name = "제품번호")
    private String product;

    @Column(name = "단가")
    private int unitPrice;

    @Column(name = "주문수량")
    private int orderQuantity;

    @Column(name = "할인율")
    private int discountRate;

}
