// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecAssetRedeemRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 赎回数量
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

    // 备注信息
    @NameInMap("info")
    @Validation(required = true)
    public String info;

    // 要赎回的充值交易ID
    @NameInMap("origin_tx_id")
    @Validation(required = true)
    public String originTxId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static ExecAssetRedeemRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAssetRedeemRequest self = new ExecAssetRedeemRequest();
        return TeaModel.build(map, self);
    }

    public ExecAssetRedeemRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAssetRedeemRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAssetRedeemRequest setAmount(Long amount) {
        this.amount = amount;
        return this;
    }
    public Long getAmount() {
        return this.amount;
    }

    public ExecAssetRedeemRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ExecAssetRedeemRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecAssetRedeemRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public ExecAssetRedeemRequest setOriginTxId(String originTxId) {
        this.originTxId = originTxId;
        return this;
    }
    public String getOriginTxId() {
        return this.originTxId;
    }

    public ExecAssetRedeemRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
