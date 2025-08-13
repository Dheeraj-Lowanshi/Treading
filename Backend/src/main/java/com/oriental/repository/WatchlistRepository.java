package com.oriental.repository;

import com.oriental.modal.Watchlist;
import org.springframework.data.jpa.repository.JpaRepository;


public interface WatchlistRepository extends JpaRepository<Watchlist,Long> {
    Watchlist findByUserId(Long userId);
}
