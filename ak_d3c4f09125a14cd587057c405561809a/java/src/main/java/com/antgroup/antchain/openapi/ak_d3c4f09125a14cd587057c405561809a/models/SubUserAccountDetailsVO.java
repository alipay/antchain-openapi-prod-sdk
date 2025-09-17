// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class SubUserAccountDetailsVO extends TeaModel {
    // 明细ID
    /**
     * <strong>example:</strong>
     * <p>明细ID</p>
     */
    @NameInMap("id")
    @Validation(required = true)
    public String id;

    // 交易链上Hash
    /**
     * <strong>example:</strong>
     * <p>交易链上Hash</p>
     */
    @NameInMap("transaction_hash")
    @Validation(required = true)
    public String transactionHash;

    // 交易前余额
    /**
     * <strong>example:</strong>
     * <p>交易前余额</p>
     */
    @NameInMap("pre_balance")
    @Validation(required = true)
    public String preBalance;

    // 交易数量
    /**
     * <strong>example:</strong>
     * <p>交易数量</p>
     */
    @NameInMap("transaction_amount")
    @Validation(required = true)
    public String transactionAmount;

    // 交易后余额
    /**
     * <strong>example:</strong>
     * <p>交易后余额</p>
     */
    @NameInMap("post_balance")
    @Validation(required = true)
    public String postBalance;

    // 交易类别
    /**
     * <strong>example:</strong>
     * <p>交易类别</p>
     */
    @NameInMap("transaction_type")
    @Validation(required = true)
    public String transactionType;

    // 对手地址
    /**
     * <strong>example:</strong>
     * <p>对手地址</p>
     */
    @NameInMap("counter_address")
    @Validation(required = true)
    public String counterAddress;

    // 创建时间
    /**
     * <strong>example:</strong>
     * <p>创建时间</p>
     */
    @NameInMap("gmt_created")
    @Validation(required = true)
    public Long gmtCreated;

    // 更新时间
    /**
     * <strong>example:</strong>
     * <p>更新时间</p>
     */
    @NameInMap("gmt_modified")
    @Validation(required = true)
    public String gmtModified;

    public static SubUserAccountDetailsVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserAccountDetailsVO self = new SubUserAccountDetailsVO();
        return TeaModel.build(map, self);
    }

    public SubUserAccountDetailsVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SubUserAccountDetailsVO setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
        return this;
    }
    public String getTransactionHash() {
        return this.transactionHash;
    }

    public SubUserAccountDetailsVO setPreBalance(String preBalance) {
        this.preBalance = preBalance;
        return this;
    }
    public String getPreBalance() {
        return this.preBalance;
    }

    public SubUserAccountDetailsVO setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }
    public String getTransactionAmount() {
        return this.transactionAmount;
    }

    public SubUserAccountDetailsVO setPostBalance(String postBalance) {
        this.postBalance = postBalance;
        return this;
    }
    public String getPostBalance() {
        return this.postBalance;
    }

    public SubUserAccountDetailsVO setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public SubUserAccountDetailsVO setCounterAddress(String counterAddress) {
        this.counterAddress = counterAddress;
        return this;
    }
    public String getCounterAddress() {
        return this.counterAddress;
    }

    public SubUserAccountDetailsVO setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public SubUserAccountDetailsVO setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
