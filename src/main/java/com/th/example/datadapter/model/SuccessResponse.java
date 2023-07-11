package com.th.example.datadapter.model;

import lombok.Data;

@Data
public class SuccessResponse<T> {
    private boolean ok;
    private T result;
}
