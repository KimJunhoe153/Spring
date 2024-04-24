package dw.model;

import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "제품")
public class Product {
    @Id
    @Column(name = "제품번호")
    private long productId;

    @Column(name = "제품명")
    private String productName;

    @Column(name = "포장단위")
    private String pkgUnit;

    @Column(name = "단가")
    private int unitPrice;

    @Column(name = "재고")
    private int inventory;
}