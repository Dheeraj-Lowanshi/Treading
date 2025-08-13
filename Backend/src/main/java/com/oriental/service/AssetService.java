package com.oriental.service;

import com.oriental.modal.Asset;
import com.oriental.modal.Coin;
import com.oriental.modal.User;

import java.util.List;

public interface AssetService {
    Asset createAsset(User user, Coin coin,double quantity);

    Asset getAssetById(Long assetId) throws Exception;

    Asset getAssetByUserIdAndId(Long userId,Long assetId);

    List<Asset>getUserAssets(Long userId);

    Asset updateAsset(Long assetId,double quantity) throws Exception;

    Asset findAssetByUserIdAndCoinId(Long userId,String coinId);

    void deleteAsset(Long assetId);

}
