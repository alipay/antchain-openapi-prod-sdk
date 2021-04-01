// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class ExecExchangeByuserRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 资产ID
    @NameInMap("asset_id")
    @Validation(required = true)
    public String assetId;

    // 资产发行方
    @NameInMap("asset_issuer")
    @Validation(required = true)
    public String assetIssuer;

    // 期望资产汇率
    @NameInMap("asset_rate")
    @Validation(required = true)
    public String assetRate;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 代理操作专用，要代理操作的租户ID
    @NameInMap("delegated_tenant_id")
    public String delegatedTenantId;

    // 权益商品ID
    @NameInMap("equity_id")
    @Validation(required = true)
    public String equityId;

    // 权益商品提供方ID
    @NameInMap("equity_provider")
    @Validation(required = true)
    public String equityProvider;

    // 期望权益汇率
    @NameInMap("equity_rate")
    @Validation(required = true)
    public String equityRate;

    // 兑换时必要信息，敏感信息需加密。兑换时必要的信息，敏感信息需加密。实际数据结构根据商品类型和描述输入，可参考https://tech.antfin.com/docs/2/163896
    @NameInMap("memo")
    public String memo;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 用户ID
    @NameInMap("user_id")
    @Validation(required = true)
    public String userId;

    public static ExecExchangeByuserRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecExchangeByuserRequest self = new ExecExchangeByuserRequest();
        return TeaModel.build(map, self);
    }

    public ExecExchangeByuserRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ExecExchangeByuserRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ExecExchangeByuserRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public ExecExchangeByuserRequest setAssetIssuer(String assetIssuer) {
        this.assetIssuer = assetIssuer;
        return this;
    }
    public String getAssetIssuer() {
        return this.assetIssuer;
    }

    public ExecExchangeByuserRequest setAssetRate(String assetRate) {
        this.assetRate = assetRate;
        return this;
    }
    public String getAssetRate() {
        return this.assetRate;
    }

    public ExecExchangeByuserRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public ExecExchangeByuserRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public ExecExchangeByuserRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public ExecExchangeByuserRequest setEquityProvider(String equityProvider) {
        this.equityProvider = equityProvider;
        return this;
    }
    public String getEquityProvider() {
        return this.equityProvider;
    }

    public ExecExchangeByuserRequest setEquityRate(String equityRate) {
        this.equityRate = equityRate;
        return this;
    }
    public String getEquityRate() {
        return this.equityRate;
    }

    public ExecExchangeByuserRequest setMemo(String memo) {
        this.memo = memo;
        return this;
    }
    public String getMemo() {
        return this.memo;
    }

    public ExecExchangeByuserRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public ExecExchangeByuserRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
