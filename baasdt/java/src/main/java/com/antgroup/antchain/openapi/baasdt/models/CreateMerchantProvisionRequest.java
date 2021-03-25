// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class CreateMerchantProvisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 外部交易ID，确保幂等
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 要创建备付金账户的租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 备付金账户币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    public static CreateMerchantProvisionRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateMerchantProvisionRequest self = new CreateMerchantProvisionRequest();
        return TeaModel.build(map, self);
    }

    public CreateMerchantProvisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CreateMerchantProvisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CreateMerchantProvisionRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

    public CreateMerchantProvisionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public CreateMerchantProvisionRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public CreateMerchantProvisionRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

}
