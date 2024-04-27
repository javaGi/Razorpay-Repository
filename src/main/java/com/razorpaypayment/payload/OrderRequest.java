package com.razorpaypayment.payload;

import lombok.Data;

@Data
public class OrderRequest {
    private long amount;
    private String currency;
}
