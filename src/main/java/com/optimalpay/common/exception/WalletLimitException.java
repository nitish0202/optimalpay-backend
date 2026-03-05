package com.optimalpay.common.exception;

public class WalletLimitException extends RuntimeException {
    public WalletLimitException(String message) {
        super(message);
    }
}
