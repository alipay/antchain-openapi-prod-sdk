// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SyncInnerTransRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 事务id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 存证事务id
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 存证的用户id
    @NameInMap("account_id")
    @Validation(required = true)
    public String accountId;

    // 业务id
    @NameInMap("biz_id")
    @Validation(required = true)
    public Long bizId;

    // 子业务id
    @NameInMap("sub_biz_id")
    public String subBizId;

    // 存证主体的json字符串
    @NameInMap("customer")
    public String customer;

    // 存证初始化时间
    @NameInMap("register_time")
    @Validation(required = true)
    public Long registerTime;

    // 到期时间
    @NameInMap("expire_time")
    public Long expireTime;

    // 扩展属性
    @NameInMap("properties")
    public String properties;

    // 是否有效
    @NameInMap("active")
    public Boolean active;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    public static SyncInnerTransRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerTransRequest self = new SyncInnerTransRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerTransRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerTransRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerTransRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SyncInnerTransRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public SyncInnerTransRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SyncInnerTransRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public SyncInnerTransRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public SyncInnerTransRequest setCustomer(String customer) {
        this.customer = customer;
        return this;
    }
    public String getCustomer() {
        return this.customer;
    }

    public SyncInnerTransRequest setRegisterTime(Long registerTime) {
        this.registerTime = registerTime;
        return this;
    }
    public Long getRegisterTime() {
        return this.registerTime;
    }

    public SyncInnerTransRequest setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public SyncInnerTransRequest setProperties(String properties) {
        this.properties = properties;
        return this;
    }
    public String getProperties() {
        return this.properties;
    }

    public SyncInnerTransRequest setActive(Boolean active) {
        this.active = active;
        return this;
    }
    public Boolean getActive() {
        return this.active;
    }

    public SyncInnerTransRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
