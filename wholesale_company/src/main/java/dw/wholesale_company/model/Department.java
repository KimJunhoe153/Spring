package dw.wholesale_company.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "부서")
public class Department {
    @Id
    @Column(name = "부서")
    private String department;

    @Column (name = "부서번호")
    private String departId;

    @Column(name = "부서명")
    private String departName;
}

