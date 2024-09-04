// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class SyncAntchainAtoFundFinanceprecheckresultRequest extends TeaModel {
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

    public static SyncAntchainAtoFundFinanceprecheckresultRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncAntchainAtoFundFinanceprecheckresultRequest self = new SyncAntchainAtoFundFinanceprecheckresultRequest();
        return TeaModel.build(map, self);
    }

    public SyncAntchainAtoFundFinanceprecheckresultRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public SyncAntchainAtoFundFinanceprecheckresultRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public SyncAntchainAtoFundFinanceprecheckresultRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public SyncAntchainAtoFundFinanceprecheckresultRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public SyncAntchainAtoFundFinanceprecheckresultRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

    public SyncAntchainAtoFundFinanceprecheckresultRequest setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public SyncAntchainAtoFundFinanceprecheckresultRequest setRefuseReason(String refuseReason) {
        this.refuseReason = refuseReason;
        return this;
    }
    public String getRefuseReason() {
        return this.refuseReason;
    }

}
