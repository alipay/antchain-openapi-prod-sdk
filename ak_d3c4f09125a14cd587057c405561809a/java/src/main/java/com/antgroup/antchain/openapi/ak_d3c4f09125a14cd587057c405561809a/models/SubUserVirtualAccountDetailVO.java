// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_d3c4f09125a14cd587057c405561809a.models;

import com.aliyun.tea.*;

public class SubUserVirtualAccountDetailVO extends TeaModel {
    // 明细ID
    /**
     * <strong>example:</strong>
     * <p>3e695195a5634f0c856a6c30358c9f5b</p>
     */
    @NameInMap("id")
    public String id;

    // 交易前余额
    /**
     * <strong>example:</strong>
     * <p>7</p>
     */
    @NameInMap("pre_balance")
    public String preBalance;

    // 交易数量
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("transaction_amount")
    public String transactionAmount;

    // 交易后余额
    /**
     * <strong>example:</strong>
     * <p>8</p>
     */
    @NameInMap("post_balance")
    public String postBalance;

    // 交易类型(TRANSFER_IN、TRANSFER_OUT)
    /**
     * <strong>example:</strong>
     * <p>TRANSFER_IN</p>
     */
    @NameInMap("transaction_type")
    public String transactionType;

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

    // 交易状态（PENDING/CONFIRMED/INVALID）
    /**
     * <strong>example:</strong>
     * <p>PENDING</p>
     */
    @NameInMap("transaction_status")
    public String transactionStatus;

    public static SubUserVirtualAccountDetailVO build(java.util.Map<String, ?> map) throws Exception {
        SubUserVirtualAccountDetailVO self = new SubUserVirtualAccountDetailVO();
        return TeaModel.build(map, self);
    }

    public SubUserVirtualAccountDetailVO setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public SubUserVirtualAccountDetailVO setPreBalance(String preBalance) {
        this.preBalance = preBalance;
        return this;
    }
    public String getPreBalance() {
        return this.preBalance;
    }

    public SubUserVirtualAccountDetailVO setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
        return this;
    }
    public String getTransactionAmount() {
        return this.transactionAmount;
    }

    public SubUserVirtualAccountDetailVO setPostBalance(String postBalance) {
        this.postBalance = postBalance;
        return this;
    }
    public String getPostBalance() {
        return this.postBalance;
    }

    public SubUserVirtualAccountDetailVO setTransactionType(String transactionType) {
        this.transactionType = transactionType;
        return this;
    }
    public String getTransactionType() {
        return this.transactionType;
    }

    public SubUserVirtualAccountDetailVO setGmtCreated(Long gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public Long getGmtCreated() {
        return this.gmtCreated;
    }

    public SubUserVirtualAccountDetailVO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public SubUserVirtualAccountDetailVO setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
        return this;
    }
    public String getTransactionStatus() {
        return this.transactionStatus;
    }

}
