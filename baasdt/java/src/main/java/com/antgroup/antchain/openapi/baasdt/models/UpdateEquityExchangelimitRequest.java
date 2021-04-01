// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class UpdateEquityExchangelimitRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

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

    // 商户每日兑换上限
    @NameInMap("limit_per_merchant_and_day")
    public Long limitPerMerchantAndDay;

    // 商户每月兑换上限
    @NameInMap("limit_per_merchant_and_montn")
    public Long limitPerMerchantAndMontn;

    // 用户每日兑换上限
    @NameInMap("limit_per_user_and_day")
    public Long limitPerUserAndDay;

    // 用户每月兑换上限
    @NameInMap("limit_per_user_and_month")
    public Long limitPerUserAndMonth;

    // 外部交易ID
    @NameInMap("out_tx_id")
    @Validation(required = true)
    public String outTxId;

    public static UpdateEquityExchangelimitRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateEquityExchangelimitRequest self = new UpdateEquityExchangelimitRequest();
        return TeaModel.build(map, self);
    }

    public UpdateEquityExchangelimitRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public UpdateEquityExchangelimitRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public UpdateEquityExchangelimitRequest setChainId(String chainId) {
        this.chainId = chainId;
        return this;
    }
    public String getChainId() {
        return this.chainId;
    }

    public UpdateEquityExchangelimitRequest setDelegatedTenantId(String delegatedTenantId) {
        this.delegatedTenantId = delegatedTenantId;
        return this;
    }
    public String getDelegatedTenantId() {
        return this.delegatedTenantId;
    }

    public UpdateEquityExchangelimitRequest setEquityId(String equityId) {
        this.equityId = equityId;
        return this;
    }
    public String getEquityId() {
        return this.equityId;
    }

    public UpdateEquityExchangelimitRequest setLimitPerMerchantAndDay(Long limitPerMerchantAndDay) {
        this.limitPerMerchantAndDay = limitPerMerchantAndDay;
        return this;
    }
    public Long getLimitPerMerchantAndDay() {
        return this.limitPerMerchantAndDay;
    }

    public UpdateEquityExchangelimitRequest setLimitPerMerchantAndMontn(Long limitPerMerchantAndMontn) {
        this.limitPerMerchantAndMontn = limitPerMerchantAndMontn;
        return this;
    }
    public Long getLimitPerMerchantAndMontn() {
        return this.limitPerMerchantAndMontn;
    }

    public UpdateEquityExchangelimitRequest setLimitPerUserAndDay(Long limitPerUserAndDay) {
        this.limitPerUserAndDay = limitPerUserAndDay;
        return this;
    }
    public Long getLimitPerUserAndDay() {
        return this.limitPerUserAndDay;
    }

    public UpdateEquityExchangelimitRequest setLimitPerUserAndMonth(Long limitPerUserAndMonth) {
        this.limitPerUserAndMonth = limitPerUserAndMonth;
        return this;
    }
    public Long getLimitPerUserAndMonth() {
        return this.limitPerUserAndMonth;
    }

    public UpdateEquityExchangelimitRequest setOutTxId(String outTxId) {
        this.outTxId = outTxId;
        return this;
    }
    public String getOutTxId() {
        return this.outTxId;
    }

}
