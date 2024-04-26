package dw.wholesale_company.model;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "주문")
public class Order {
    @Id
    @Column(name = "주문번호")
    private String orderId;

    @ManyToOne
    @JoinColumn(name = "고객번호")
    private Customer customer;

    @ManyToOne
    @JoinColumn(name = "사원번호")
    private Employee employee;

    @Column(name = "주문일")
    private int orderDate;

    @Column(name = "요청일")
    private int requestDate;

    @Column(name = "발송일")
    private int shippingDate;
    }
