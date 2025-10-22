// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.webtrwatrade.models;

import com.aliyun.tea.*;

public class SubUserBonusAccountDetailVO extends TeaModel {
    // 明细ID
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 交易链上Hash
    /**
     * <strong>example:</strong>
     * <p>0x9fe688e456d3c4b15edceff3c23380300d71b48649ae8d61c6a9e513bb095262</p>
     */
    @NameInMap("transaction_hash")
    @Validation(required = true)
    public String transactionHash;

    // 交易前余额
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("pre_balance")
    @Validation(required = true)
    public String preBalance;

    // 交易数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("transaction_amount")
    @Validation(required = true)
    public String transactionAmount;

    // 交易后余额
    /**
     * <strong>example:</strong>
     * <p>1.0</p>
     */
    @NameInMap("post_balance")
    @Validation(required = true)
    public String postBalance;

    // 交易类别
    /**
     * <strong>example:</strong>
     * <p>ISSUE</p>
     */
    @NameInMap("transaction_type")
    @Validation(required = true)
    public String transactionType;

    // 对手地址
    /**
     * <strong>example:</strong>
     * <p>0x9f6a540f4079d29ff5a9c5985e9ee87f3b713117</p>
     */
    @NameInMap("counter_address")
    @Validation(required = true)
    public String counterAddress;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>1755754919690</p>
     */
    @NameInMap("gmt_created")
    @Validation(required = true)
    public Long gmtCreated;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>1755754919690</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public Long gmtModified;

    public static SubUserBonusAccountDetailVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserBonusAccountDetailVO self = new SubUserBonusAccountDetailVO();
        return TeaModel.build(map, self);
    }

    public SubUserBonusAccountDetailVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SubUserBonusAccountDetailVO setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public SubUserBonusAccountDetailVO setPreBalance(String preBalance) {
        this.preBalance = preBalance;
        return this;
    }
    public String getPreBalance() {
        return this.preBalance;
    }

    public SubUserBonusAccountDetailVO setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }
    public String getTransactionAmount() {
        return this.transactionAmount;
    }

    public SubUserBonusAccountDetailVO setPostBalance(String postBalance) {
        this.postBalance = postBalance;
        return this;
    }
    public String getPostBalance() {
        return this.postBalance;
    }

    public SubUserBonusAccountDetailVO setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public SubUserBonusAccountDetailVO setCounterAddress(String counterAddress) {
        this.counterAddress = counterAddress;
        return this;
    }
    public String getCounterAddress() {
        return this.counterAddress;
    }

    public SubUserBonusAccountDetailVO setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public SubUserBonusAccountDetailVO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

}
