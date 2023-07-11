package com.th.example.datadapter.model;

import lombok.Data;

@Data
public class ErrorResponse {
    private boolean ok = true;
    private Error error;
}
