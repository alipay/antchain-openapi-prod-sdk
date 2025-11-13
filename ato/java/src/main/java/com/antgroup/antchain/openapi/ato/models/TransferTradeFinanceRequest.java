// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class TransferTradeFinanceRequest extends TeaModel {
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

    // 融资模式
    @NameInMap("fund_mode")
    public String fundMode;

    public static TransferTradeFinanceRequest build(java.util.Map<String, ?> map) throws Exception {
        TransferTradeFinanceRequest self = new TransferTradeFinanceRequest();
        return TeaModel.build(map, self);
    }

    public TransferTradeFinanceRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public TransferTradeFinanceRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public TransferTradeFinanceRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public TransferTradeFinanceRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public TransferTradeFinanceRequest setFundIdList(java.util.List<String> fundIdList) {
        this.fundIdList = fundIdList;
        return this;
    }
    public java.util.List<String> getFundIdList() {
        return this.fundIdList;
    }

    public TransferTradeFinanceRequest setFundSignMode(String fundSignMode) {
        this.fundSignMode = fundSignMode;
        return this;
    }
    public String getFundSignMode() {
        return this.fundSignMode;
    }

    public TransferTradeFinanceRequest setDivideStartTermIndex(Long divideStartTermIndex) {
        this.divideStartTermIndex = divideStartTermIndex;
        return this;
    }
    public Long getDivideStartTermIndex() {
        return this.divideStartTermIndex;
    }

    public TransferTradeFinanceRequest setFundMode(String fundMode) {
        this.fundMode = fundMode;
        return this;
    }
    public String getFundMode() {
        return this.fundMode;
    }

}
