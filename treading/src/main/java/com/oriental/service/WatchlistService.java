package com.oriental.service;

import com.oriental.modal.Coin;
import com.oriental.modal.User;
import com.oriental.modal.Watchlist;

public interface WatchlistService {

    Watchlist findUserWatchlist(Long userId) throws Exception;
    Watchlist createWatchlist(User user);
    Watchlist findById(Long id) throws Exception;
    Coin addItemToWatchlist(Coin coin,User user) throws Exception;

}
