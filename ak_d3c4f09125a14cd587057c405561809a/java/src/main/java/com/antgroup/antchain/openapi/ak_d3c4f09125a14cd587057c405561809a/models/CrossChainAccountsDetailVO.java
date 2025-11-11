// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class CrossChainAccountsDetailVO extends TeaModel {
    // 明细ID
    /**
     * <strong>example:</strong>
     * <p>0ef1c7f82ffb44989e8b6e6b6360a3a7</p>
     */
    @NameInMap("id")
    public String id;

    // 交易链上Hash
    /**
     * <strong>example:</strong>
     * <p>0xf1ada29c07fd95444030d9001ad09b7fd2111aed063ee0753e181fb2a3f53057</p>
     */
    @NameInMap("transaction_hash")
    public String transactionHash;

    // 交易前余额
    /**
     * <strong>example:</strong>
     * <p>1000.000000000</p>
     */
    @NameInMap("pre_balance")
    public String preBalance;

    // 交易数量
    /**
     * <strong>example:</strong>
     * <p>1000.000000000</p>
     */
    @NameInMap("transaction_amount")
    public String transactionAmount;

    // 交易后余额
    /**
     * <strong>example:</strong>
     * <p>2000.000000000</p>
     */
    @NameInMap("post_balance")
    public String postBalance;

    // 交易类别(LOCK_MINT/BURN_RETRIEVE/INNER_TRANSFER/OTC_TRANSFER)
    /**
     * <strong>example:</strong>
     * <p>LOCK_MINT</p>
     */
    @NameInMap("transaction_type")
    public String transactionType;

    // 对手地址
    /**
     * <strong>example:</strong>
     * <p>0x5639ede048dc910b917b518ae8d3cbb184fc749d</p>
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

    public static CrossChainAccountsDetailVO build(java.util.Map<String, ?> map) throws Exception {
        CrossChainAccountsDetailVO self = new CrossChainAccountsDetailVO();
        return TeaModel.build(map, self);
    }

    public CrossChainAccountsDetailVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CrossChainAccountsDetailVO setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public CrossChainAccountsDetailVO setPreBalance(String preBalance) {
        this.preBalance = preBalance;
        return this;
    }
    public String getPreBalance() {
        return this.preBalance;
    }

    public CrossChainAccountsDetailVO setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }
    public String getTransactionAmount() {
        return this.transactionAmount;
    }

    public CrossChainAccountsDetailVO setPostBalance(String postBalance) {
        this.postBalance = postBalance;
        return this;
    }
    public String getPostBalance() {
        return this.postBalance;
    }

    public CrossChainAccountsDetailVO setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public CrossChainAccountsDetailVO setCounterAddress(String counterAddress) {
        this.counterAddress = counterAddress;
        return this;
    }
    public String getCounterAddress() {
        return this.counterAddress;
    }

    public CrossChainAccountsDetailVO setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public CrossChainAccountsDetailVO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

}
