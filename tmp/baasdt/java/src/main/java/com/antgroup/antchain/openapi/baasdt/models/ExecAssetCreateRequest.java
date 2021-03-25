// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecAssetCreateRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 资产名称
    @NameInMap("asset_name")
    @Validation(required = true)
    public String assetName;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 资产绑定币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 为该租户创建新资产
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 资产汇率(等值一元钱的数量)
    @NameInMap("rate")
    @Validation(required = true)
    public String rate;

    public static ExecAssetCreateRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecAssetCreateRequest self = new ExecAssetCreateRequest();
        return TeaModel.build(map, self);
    }

    public ExecAssetCreateRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecAssetCreateRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecAssetCreateRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ExecAssetCreateRequest setAssetName(String assetName) {
        this.assetName = assetName;
        return this;
    }
    public String getAssetName() {
        return this.assetName;
    }

    public ExecAssetCreateRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecAssetCreateRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public ExecAssetCreateRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public ExecAssetCreateRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecAssetCreateRequest setRate(String rate) {
        this.rate = rate;
        return this;
    }
    public String getRate() {
        return this.rate;
    }

}
