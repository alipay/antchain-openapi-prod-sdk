// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecAssetGrantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 数量
    @NameInMap("amount")
    @Validation(required = true)
    public String amount;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 资产发放信息
    @NameInMap("info")
    public String info;

    // 商户ID
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    // 有效时间
    @NameInMap("validity_time")
    @Validation(required = true)
    public String validityTime;

    public static ExecAssetGrantRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAssetGrantRequest self = new ExecAssetGrantRequest();
        return TeaModel.build(map, self);
    }

    public ExecAssetGrantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAssetGrantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAssetGrantRequest setAmount(String amount) {
        this.amount = amount;
        return this;
    }
    public String getAmount() {
        return this.amount;
    }

    public ExecAssetGrantRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ExecAssetGrantRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecAssetGrantRequest setInfo(String info) {
        this.info = info;
        return this;
    }
    public String getInfo() {
        return this.info;
    }

    public ExecAssetGrantRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public ExecAssetGrantRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecAssetGrantRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public ExecAssetGrantRequest setValidityTime(String validityTime) {
        this.validityTime = validityTime;
        return this;
    }
    public String getValidityTime() {
        return this.validityTime;
    }

}
