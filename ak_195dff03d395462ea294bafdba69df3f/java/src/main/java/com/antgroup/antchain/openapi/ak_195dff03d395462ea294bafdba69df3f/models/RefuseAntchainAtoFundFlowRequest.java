// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_195dff03d395462ea294bafdba69df3f.models;

import com.aliyun.tea.*;

public class RefuseAntchainAtoFundFlowRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 订单所属商户的统一社会信用代码
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 商户的订单号
    @NameInMap("order_id")
    @Validation(required = true)
    public String orderId;

    // 签署合同单号
    @NameInMap("sign_no")
    @Validation(required = true)
    public String signNo;

    // 填写拒绝落章原因，如果同意则不用填写
    @NameInMap("sign_reason")
    public String signReason;

    // 资方统一社会信用代码
    @NameInMap("fund_id")
    public String fundId;

    public static RefuseAntchainAtoFundFlowRequest build(java.util.Map<String, ?> map) throws Exception {
        RefuseAntchainAtoFundFlowRequest self = new RefuseAntchainAtoFundFlowRequest();
        return TeaModel.build(map, self);
    }

    public RefuseAntchainAtoFundFlowRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public RefuseAntchainAtoFundFlowRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public RefuseAntchainAtoFundFlowRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public RefuseAntchainAtoFundFlowRequest setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public RefuseAntchainAtoFundFlowRequest setSignNo(String signNo) {
        this.signNo = signNo;
        return this;
    }
    public String getSignNo() {
        return this.signNo;
    }

    public RefuseAntchainAtoFundFlowRequest setSignReason(String signReason) {
        this.signReason = signReason;
        return this;
    }
    public String getSignReason() {
        return this.signReason;
    }

    public RefuseAntchainAtoFundFlowRequest setFundId(String fundId) {
        this.fundId = fundId;
        return this;
    }
    public String getFundId() {
        return this.fundId;
    }

}
