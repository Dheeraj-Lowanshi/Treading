package com.oriental.service;

import com.oriental.modal.Order;
import com.oriental.modal.User;
import com.oriental.modal.Wallet;

public interface WalletService {


    Wallet getUserWallet(User user);

    Wallet addBalance(Wallet wallet,Long money);

    Wallet findWalletById(Long id) throws Exception;

    Wallet walletToWalletTransfer(User sender,Wallet receiverWallet,Long amount) throws Exception;
    Wallet payOrderPayment(Order order,User user) throws Exception;


}
