// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class SetMerchantProvisionRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 链ID
    @NameInMap("chain_id")
    @Validation(required = true)
    public String chainId;

    // 新的授信上限（单位：元）
    @NameInMap("credit_max_amount")
    public String creditMaxAmount;

    // 新的授信已使用数额（单位：元）
    @NameInMap("credit_used_amount")
    public String creditUsedAmount;

    // 币种
    @NameInMap("currency")
    @Validation(required = true)
    public String currency;

    // 新的备付金余额（单位：元）
    @NameInMap("debit_amount")
    public String debitAmount;

    // 要设置备付金的商户租户ID
    @NameInMap("opt_tenant_id")
    @Validation(required = true)
    public String optTenantId;

    // 初始的授信上限（单位：元）
    @NameInMap("original_credit_max_amount")
    public String originalCreditMaxAmount;

    // 初始的授信已使用数额（单位：元）
    @NameInMap("original_credit_used_amount")
    public String originalCreditUsedAmount;

    // 初始的备付金余额（单位：元）
    @NameInMap("original_debit_amount")
    public String originalDebitAmount;

    // 外部交易ID（确保幂等）
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static SetMerchantProvisionRequest build(java.util.Map<String, ?> map) throws Exception {
        SetMerchantProvisionRequest self = new SetMerchantProvisionRequest();
        return TeaModel.build(map, self);
    }

    public SetMerchantProvisionRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SetMerchantProvisionRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SetMerchantProvisionRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public SetMerchantProvisionRequest setCreditMaxAmount(String creditMaxAmount) {
        this.creditMaxAmount = creditMaxAmount;
        return this;
    }
    public String getCreditMaxAmount() {
        return this.creditMaxAmount;
    }

    public SetMerchantProvisionRequest setCreditUsedAmount(String creditUsedAmount) {
        this.creditUsedAmount = creditUsedAmount;
        return this;
    }
    public String getCreditUsedAmount() {
        return this.creditUsedAmount;
    }

    public SetMerchantProvisionRequest setCurrency(String currency) {
        this.currency = currency;
        return this;
    }
    public String getCurrency() {
        return this.currency;
    }

    public SetMerchantProvisionRequest setDebitAmount(String debitAmount) {
        this.debitAmount = debitAmount;
        return this;
    }
    public String getDebitAmount() {
        return this.debitAmount;
    }

    public SetMerchantProvisionRequest setOptTenantId(String optTenantId) {
        this.optTenantId = optTenantId;
        return this;
    }
    public String getOptTenantId() {
        return this.optTenantId;
    }

    public SetMerchantProvisionRequest setOriginalCreditMaxAmount(String originalCreditMaxAmount) {
        this.originalCreditMaxAmount = originalCreditMaxAmount;
        return this;
    }
    public String getOriginalCreditMaxAmount() {
        return this.originalCreditMaxAmount;
    }

    public SetMerchantProvisionRequest setOriginalCreditUsedAmount(String originalCreditUsedAmount) {
        this.originalCreditUsedAmount = originalCreditUsedAmount;
        return this;
    }
    public String getOriginalCreditUsedAmount() {
        return this.originalCreditUsedAmount;
    }

    public SetMerchantProvisionRequest setOriginalDebitAmount(String originalDebitAmount) {
        this.originalDebitAmount = originalDebitAmount;
        return this;
    }
    public String getOriginalDebitAmount() {
        return this.originalDebitAmount;
    }

    public SetMerchantProvisionRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
