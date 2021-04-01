// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetMerchantFundmanagerRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 要进行资金管理员设置的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 资金管理员所属的租户ID
    @NameInMap("fund_manager_tenant_id")
    @Validation(required = true)
    public String fundManagerTenantId;

    public static SetMerchantFundmanagerRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMerchantFundmanagerRequest self = new SetMerchantFundmanagerRequest();
        return TeaModel.build(map, self);
    }

    public SetMerchantFundmanagerRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetMerchantFundmanagerRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetMerchantFundmanagerRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public SetMerchantFundmanagerRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public SetMerchantFundmanagerRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public SetMerchantFundmanagerRequest setFundManagerTenantId(String fundManagerTenantId) {
        this.fundManagerTenantId = fundManagerTenantId;
        return this;
    }
    public String getFundManagerTenantId() {
        return this.fundManagerTenantId;
    }

}
