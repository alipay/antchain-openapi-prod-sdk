// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class SyncInnerNotaryRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // DB的存证id
    @NameInMap("id")
    @Validation(required = true)
    public Long id;

    // 事务id
    @NameInMap("transaction_id")
    @Validation(required = true)
    public String transactionId;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 阶段
    @NameInMap("phase")
    @Validation(required = true)
    public String phase;

    // 内容hash
    @NameInMap("content_hash")
    @Validation(required = true)
    public String contentHash;

    // 创建时间
    @NameInMap("create_time")
    public Long createTime;

    // 存证类型
    @NameInMap("notary_type")
    @Validation(required = true)
    public String notaryType;

    // 大小
    @NameInMap("notary_size")
    public Long notarySize;

    // 用户id
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

    // 是否需要可信时间
    @NameInMap("tsr")
    public Boolean tsr;

    public static SyncInnerNotaryRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncInnerNotaryRequest self = new SyncInnerNotaryRequest();
        return TeaModel.build(map, self);
    }

    public SyncInnerNotaryRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncInnerNotaryRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncInnerNotaryRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SyncInnerNotaryRequest setTransactionId(String transactionId) {
        this.transactionId = transactionId;
        return this;
    }
    public String getTransactionId() {
        return this.transactionId;
    }

    public SyncInnerNotaryRequest setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public SyncInnerNotaryRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public SyncInnerNotaryRequest setContentHash(String contentHash) {
        this.contentHash = contentHash;
        return this;
    }
    public String getContentHash() {
        return this.contentHash;
    }

    public SyncInnerNotaryRequest setCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }
    public Long getCreateTime() {
        return this.createTime;
    }

    public SyncInnerNotaryRequest setNotaryType(String notaryType) {
        this.notaryType = notaryType;
        return this;
    }
    public String getNotaryType() {
        return this.notaryType;
    }

    public SyncInnerNotaryRequest setNotarySize(Long notarySize) {
        this.notarySize = notarySize;
        return this;
    }
    public Long getNotarySize() {
        return this.notarySize;
    }

    public SyncInnerNotaryRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SyncInnerNotaryRequest setBizId(Long bizId) {
        this.bizId = bizId;
        return this;
    }
    public Long getBizId() {
        return this.bizId;
    }

    public SyncInnerNotaryRequest setSubBizId(String subBizId) {
        this.subBizId = subBizId;
        return this;
    }
    public String getSubBizId() {
        return this.subBizId;
    }

    public SyncInnerNotaryRequest setTsr(Boolean tsr) {
        this.tsr = tsr;
        return this;
    }
    public Boolean getTsr() {
        return this.tsr;
    }

}
