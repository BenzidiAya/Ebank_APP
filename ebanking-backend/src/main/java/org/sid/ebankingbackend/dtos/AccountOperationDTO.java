package org.sid.ebankingbackend.dtos;

import org.sid.ebankingbackend.enums.OperationType;

import java.util.Date;

public class AccountOperationDTO {
    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
