// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class PositionItem extends TeaModel {
    // 网络（Ethereum/Solana/Bitcoin等）
    /**
     * <strong>example:</strong>
     * <p>Ethereum</p>
     */
    @NameInMap("blockchain")
    @Validation(required = true)
    public String blockchain;

    // 币种
    /**
     * <strong>example:</strong>
     * <p>USDT</p>
     */
    @NameInMap("token_symbol")
    @Validation(required = true)
    public String tokenSymbol;

    // 代币地址
    /**
     * <strong>example:</strong>
     * <p>5691001d42474115ad7f9b5dfc84dec3</p>
     */
    @NameInMap("token_address")
    @Validation(required = true)
    public String tokenAddress;

    // 总余额（精度18位小数）
    /**
     * <strong>example:</strong>
     * <p>1.012345</p>
     */
    @NameInMap("total_balance")
    @Validation(required = true)
    public String totalBalance;

    // 在途入金
    /**
     * <strong>example:</strong>
     * <p>0.012345</p>
     */
    @NameInMap("processing_in_amount")
    @Validation(required = true)
    public String processingInAmount;

    // 在途出金
    /**
     * <strong>example:</strong>
     * <p>0.012344</p>
     */
    @NameInMap("processing_out_amount")
    @Validation(required = true)
    public String processingOutAmount;

    // 可用余额（精度18位小数）
    /**
     * <strong>example:</strong>
     * <p>1.000001</p>
     */
    @NameInMap("available_balance")
    @Validation(required = true)
    public String availableBalance;

    // 钱包地址
    /**
     * <strong>example:</strong>
     * <p>d8e0v5q0m8u8h0w9y6l7v4o2j1f3b9i4v1m2o0i0p6b2o7c3l5v5p3b5k0n0z7u3</p>
     */
    @NameInMap("wallet_address")
    @Validation(required = true)
    public String walletAddress;

    public static PositionItem build(java.util.Map<String, ?> map) throws Exception {
        PositionItem self = new PositionItem();
        return TeaModel.build(map, self);
    }

    public PositionItem setBlockchain(String blockchain) {
        this.blockchain = blockchain;
        return this;
    }
    public String getBlockchain() {
        return this.blockchain;
    }

    public PositionItem setTokenSymbol(String tokenSymbol) {
        this.tokenSymbol = tokenSymbol;
        return this;
    }
    public String getTokenSymbol() {
        return this.tokenSymbol;
    }

    public PositionItem setTokenAddress(String tokenAddress) {
        this.tokenAddress = tokenAddress;
        return this;
    }
    public String getTokenAddress() {
        return this.tokenAddress;
    }

    public PositionItem setTotalBalance(String totalBalance) {
        this.totalBalance = totalBalance;
        return this;
    }
    public String getTotalBalance() {
        return this.totalBalance;
    }

    public PositionItem setProcessingInAmount(String processingInAmount) {
        this.processingInAmount = processingInAmount;
        return this;
    }
    public String getProcessingInAmount() {
        return this.processingInAmount;
    }

    public PositionItem setProcessingOutAmount(String processingOutAmount) {
        this.processingOutAmount = processingOutAmount;
        return this;
    }
    public String getProcessingOutAmount() {
        return this.processingOutAmount;
    }

    public PositionItem setAvailableBalance(String availableBalance) {
        this.availableBalance = availableBalance;
        return this;
    }
    public String getAvailableBalance() {
        return this.availableBalance;
    }

    public PositionItem setWalletAddress(String walletAddress) {
        this.walletAddress = walletAddress;
        return this;
    }
    public String getWalletAddress() {
        return this.walletAddress;
    }

}
