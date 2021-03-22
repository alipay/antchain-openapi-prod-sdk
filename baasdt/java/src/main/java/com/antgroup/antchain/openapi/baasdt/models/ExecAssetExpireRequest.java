// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecAssetExpireRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数量
    @NameInMap("amount")
    @Validation(required = true)
    public Long amount;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 资产过期信息
    @NameInMap("info")
    public String info;

    // 过期的交易ID
    @NameInMap("original_tx_id")
    @Validation(required = true)
    public String originalTxId;

    // 外部交易ID，每个租户保证唯一
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static ExecAssetExpireRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAssetExpireRequest self = new ExecAssetExpireRequest();
        return TeaModel.build(map, self);
    }

    public ExecAssetExpireRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAssetExpireRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAssetExpireRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ExecAssetExpireRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ExecAssetExpireRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecAssetExpireRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public ExecAssetExpireRequest setOriginalTxId(String originalTxId) {
        this.originalTxId = originalTxId;
        return this;
    }
    public String getOriginalTxId() {
        return this.originalTxId;
    }

    public ExecAssetExpireRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecAssetExpireRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
