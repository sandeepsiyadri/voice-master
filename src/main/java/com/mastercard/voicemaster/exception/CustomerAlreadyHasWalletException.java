package com.mastercard.voicemaster.exception;

import com.mastercard.voicemaster.models.Customer;

public class CustomerAlreadyHasWalletException extends Exception {
    public CustomerAlreadyHasWalletException(Customer customer) {
        super("Customer "+customer.getFname()+" "+customer.getLname()+" already owns a wallet : "+customer.getWallet().getWalletId());
    }
}
