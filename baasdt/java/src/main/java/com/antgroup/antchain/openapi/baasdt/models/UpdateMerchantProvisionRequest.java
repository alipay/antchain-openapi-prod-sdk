// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateMerchantProvisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    // 集群ID
    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 更新授信上限
    @NameInMap("credit_max_amount")
    public String creditMaxAmount;

    // 更新授信已使用数额
    @NameInMap("credit_used_amount")
    public String creditUsedAmount;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 更新余额
    @NameInMap("debit_amount")
    public String debitAmount;

    // 要设置备付金的商户租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 操作类型，ADD表示增加，SUB表示减少
    @NameInMap("opt_type")
    @Validation(required = true)
    public String optType;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static UpdateMerchantProvisionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateMerchantProvisionRequest self = new UpdateMerchantProvisionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateMerchantProvisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateMerchantProvisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateMerchantProvisionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateMerchantProvisionRequest setCreditMaxAmount(String creditMaxAmount) {
        this.creditMaxAmount = creditMaxAmount;
        return this;
    }
    public String getCreditMaxAmount() {
        return this.creditMaxAmount;
    }

    public UpdateMerchantProvisionRequest setCreditUsedAmount(String creditUsedAmount) {
        this.creditUsedAmount = creditUsedAmount;
        return this;
    }
    public String getCreditUsedAmount() {
        return this.creditUsedAmount;
    }

    public UpdateMerchantProvisionRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public UpdateMerchantProvisionRequest setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
        return this;
    }
    public String getDebitAmount() {
        return this.debitAmount;
    }

    public UpdateMerchantProvisionRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public UpdateMerchantProvisionRequest setOptType(String optType) {
        this.optType = optType;
        return this;
    }
    public String getOptType() {
        return this.optType;
    }

    public UpdateMerchantProvisionRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
