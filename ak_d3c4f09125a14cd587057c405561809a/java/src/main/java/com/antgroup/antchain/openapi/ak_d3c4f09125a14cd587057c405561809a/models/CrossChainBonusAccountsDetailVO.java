// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class CrossChainBonusAccountsDetailVO extends TeaModel {
    // 明细ID
    /**
     * <strong>example:</strong>
     * <p>明细ID</p>
     */
    @NameInMap("id")
    public String id;

    // 交易链上Hash
    /**
     * <strong>example:</strong>
     * <p>交易链上Hash</p>
     */
    @NameInMap("transaction_hash")
    public String transactionHash;

    // 交易前余额
    /**
     * <strong>example:</strong>
     * <p>交易前余额</p>
     */
    @NameInMap("pre_balance")
    public String preBalance;

    // 交易数量
    /**
     * <strong>example:</strong>
     * <p>交易数量</p>
     */
    @NameInMap("transaction_amount")
    public String transactionAmount;

    // 交易后余额
    /**
     * <strong>example:</strong>
     * <p>交易后余额</p>
     */
    @NameInMap("post_balance")
    public String postBalance;

    // 交易类型
    /**
     * <strong>example:</strong>
     * <p>交易类型(LOCK_MINT_BONUS/BURN_RETRIEVE_BONUS/INNER_TRANSFER_BONUS/OTC_TRANSFER_BONUS)</p>
     */
    @NameInMap("transaction_type")
    public String transactionType;

    // 对手地址
    /**
     * <strong>example:</strong>
     * <p>对手地址</p>
     */
    @NameInMap("counter_address")
    public String counterAddress;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1755754919690</p>
     */
    @NameInMap("gmt_created")
    public Long gmtCreated;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>1755754919690</p>
     */
    @NameInMap("gmt_modified")
    public Long gmtModified;

    public static CrossChainBonusAccountsDetailVO build(java.util.Map<String, ?> map) throws Exception {
        CrossChainBonusAccountsDetailVO self = new CrossChainBonusAccountsDetailVO();
        return TeaModel.build(map, self);
    }

    public CrossChainBonusAccountsDetailVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CrossChainBonusAccountsDetailVO setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public CrossChainBonusAccountsDetailVO setPreBalance(String preBalance) {
        this.preBalance = preBalance;
        return this;
    }
    public String getPreBalance() {
        return this.preBalance;
    }

    public CrossChainBonusAccountsDetailVO setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }
    public String getTransactionAmount() {
        return this.transactionAmount;
    }

    public CrossChainBonusAccountsDetailVO setPostBalance(String postBalance) {
        this.postBalance = postBalance;
        return this;
    }
    public String getPostBalance() {
        return this.postBalance;
    }

    public CrossChainBonusAccountsDetailVO setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public CrossChainBonusAccountsDetailVO setCounterAddress(String counterAddress) {
        this.counterAddress = counterAddress;
        return this;
    }
    public String getCounterAddress() {
        return this.counterAddress;
    }

    public CrossChainBonusAccountsDetailVO setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public CrossChainBonusAccountsDetailVO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

}
