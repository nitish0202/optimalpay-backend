package com.optimalpay.common.exception;

public class EmptyWalletException extends RuntimeException {
    public EmptyWalletException(String message) {
        super(message);
    }
}
