// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateMerchantRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 商户描述，不超过2048
    @NameInMap("description")
    public String description;

    // 商户的资金管理员 归属的租户ID
    @NameInMap("fund_manager_tenant_id")
    @Validation(required = true)
    public String fundManagerTenantId;

    // 商户角色，是否是资产发行商
    @NameInMap("if_asset_issuer")
    @Validation(required = true)
    public Boolean ifAssetIssuer;

    // 商户角色，是否是采购商
    @NameInMap("if_equity_consumer")
    @Validation(required = true)
    public Boolean ifEquityConsumer;

    // 商户角色，是否是供应商
    @NameInMap("if_equity_provider")
    @Validation(required = true)
    public Boolean ifEquityProvider;

    // 商户归属的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 外部交易ID（确保幂等）
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static CreateMerchantRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMerchantRequest self = new CreateMerchantRequest();
        return TeaModel.build(map, self);
    }

    public CreateMerchantRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMerchantRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMerchantRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateMerchantRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateMerchantRequest setFundManagerTenantId(String fundManagerTenantId) {
        this.fundManagerTenantId = fundManagerTenantId;
        return this;
    }
    public String getFundManagerTenantId() {
        return this.fundManagerTenantId;
    }

    public CreateMerchantRequest setIfAssetIssuer(Boolean ifAssetIssuer) {
        this.ifAssetIssuer = ifAssetIssuer;
        return this;
    }
    public Boolean getIfAssetIssuer() {
        return this.ifAssetIssuer;
    }

    public CreateMerchantRequest setIfEquityConsumer(Boolean ifEquityConsumer) {
        this.ifEquityConsumer = ifEquityConsumer;
        return this;
    }
    public Boolean getIfEquityConsumer() {
        return this.ifEquityConsumer;
    }

    public CreateMerchantRequest setIfEquityProvider(Boolean ifEquityProvider) {
        this.ifEquityProvider = ifEquityProvider;
        return this;
    }
    public Boolean getIfEquityProvider() {
        return this.ifEquityProvider;
    }

    public CreateMerchantRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public CreateMerchantRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
