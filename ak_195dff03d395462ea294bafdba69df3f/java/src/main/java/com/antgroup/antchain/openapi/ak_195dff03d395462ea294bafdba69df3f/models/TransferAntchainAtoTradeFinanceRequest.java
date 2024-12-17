// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class TransferAntchainAtoTradeFinanceRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id
    @NameInMap("order_id")
    @Validation(required = true, minLength = 1)
    public String orderId;

    // 公司社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, minLength = 1)
    public String merchantId;

    // 待预审资方列表
    @NameInMap("fund_id_list")
    @Validation(required = true)
    public java.util.List<String> fundIdList;

    // 融资签署模式
    @NameInMap("fund_sign_mode")
    @Validation(required = true, minLength = 1)
    public String fundSignMode;

    // 商户分账起始期数
    @NameInMap("divide_start_term_index")
    @Validation(required = true, minimum = 1)
    public Long divideStartTermIndex;

    public static TransferAntchainAtoTradeFinanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferAntchainAtoTradeFinanceRequest self = new TransferAntchainAtoTradeFinanceRequest();
        return TeaModel.build(map, self);
    }

    public TransferAntchainAtoTradeFinanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TransferAntchainAtoTradeFinanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TransferAntchainAtoTradeFinanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransferAntchainAtoTradeFinanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public TransferAntchainAtoTradeFinanceRequest setFundIdList(java.util.List<String> fundIdList) {
        this.fundIdList = fundIdList;
        return this;
    }
    public java.util.List<String> getFundIdList() {
        return this.fundIdList;
    }

    public TransferAntchainAtoTradeFinanceRequest setFundSignMode(String fundSignMode) {
        this.fundSignMode = fundSignMode;
        return this;
    }
    public String getFundSignMode() {
        return this.fundSignMode;
    }

    public TransferAntchainAtoTradeFinanceRequest setDivideStartTermIndex(Long divideStartTermIndex) {
        this.divideStartTermIndex = divideStartTermIndex;
        return this;
    }
    public Long getDivideStartTermIndex() {
        return this.divideStartTermIndex;
    }

}
