package com.example.databasegenerator.entities;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "stock")
@SequenceGenerator(name = "seqStock", sequenceName = "SEQSTOCK", allocationSize = 1)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Stock {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "seqStock")
    private Long id;
    private String stockName;
    private String currency;
    private BigDecimal currentValue;

}
