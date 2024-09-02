// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class SyncFundFinanceprecheckresultRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单id 长度不可超过50
    @NameInMap("order_id")
    @Validation(required = true, minLength = 6)
    public String orderId;

    // 订单所属商户的社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true, minLength = 1)
    public String merchantId;

    // 资方的社会信用代码
    @NameInMap("fund_id")
    @Validation(required = true, minLength = 1)
    public String fundId;

    // 预审结果
    // ● APPROVAL ： 通过
    // ● REFUSE ：拒绝
    @NameInMap("result")
    @Validation(required = true, minLength = 1)
    public String result;

    // 拒绝原因
    @NameInMap("refuse_reason")
    @Validation(maxLength = 100)
    public String refuseReason;

    public static SyncFundFinanceprecheckresultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncFundFinanceprecheckresultRequest self = new SyncFundFinanceprecheckresultRequest();
        return TeaModel.build(map, self);
    }

    public SyncFundFinanceprecheckresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncFundFinanceprecheckresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncFundFinanceprecheckresultRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncFundFinanceprecheckresultRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncFundFinanceprecheckresultRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SyncFundFinanceprecheckresultRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SyncFundFinanceprecheckresultRequest setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
        return this;
    }
    public String getRefuseReason() {
        return this.refuseReason;
    }

}
