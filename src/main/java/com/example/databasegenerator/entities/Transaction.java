package com.example.databasegenerator.entities;

import com.example.databasegenerator.entities.enums.TransactionTypeEnum;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "transaction")
@SequenceGenerator(name = "seqTransaction", sequenceName = "SEQTRANSACTION", allocationSize = 1)
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seqTransaction")
    @Column(name = "id", nullable = false)
    private Long id;
    @OneToOne
    @JoinColumn(name = "stock_id")
    private Stock stock;
    private String dtSubmitted;
    private BigDecimal amountValue;
    @Enumerated(EnumType.STRING)
    private TransactionTypeEnum trasactionType;

}
