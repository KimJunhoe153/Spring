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
@Table(name = "마일리지")
public class Mileage {
    @Id
    @Column(name = "등급명")
    private int mileageGrade;

    @Column(name = "하한마일리지")
    private int lowLimit;

    @Column(name = "상한마일리지")
    private int highLimit;
}
