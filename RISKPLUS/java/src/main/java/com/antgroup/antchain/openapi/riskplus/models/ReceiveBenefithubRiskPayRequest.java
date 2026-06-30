// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class ReceiveBenefithubRiskPayRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 业务分配的平台code，8位纯大写字母code
    @NameInMap("platform_code")
    @Validation(required = true)
    public String platformCode;

    // 产品code
    @NameInMap("product_code")
    @Validation(required = true)
    public String productCode;

    // 平台code、用户唯一ID 组合出全局唯一id
    @NameInMap("user_unique_id")
    @Validation(required = true)
    public String userUniqueId;

    // 类型：订单支付结果类、订单退款类、续费扣款类、签约成功、解约成功、订单超时类型
    // 具体如下：
    // ODRDER_PAYMENT-订单支付结果类通知、ORDER_REFUND-订单退款、RENEWAL_DEDUCTION-续费扣款、CONTRACT_SIGNED-签约成功、CONTRACT_TERMINATED-解约成功、
    // ORDER_TIMEOUT-订单超时类型
    @NameInMap("result_type")
    @Validation(required = true)
    public String resultType;

    // 回调结果，json数据
    // 各个平台返回的支付结果、支付退款、续费结果通知、签约、解约、订单、超时关单
    @NameInMap("callback_result")
    @Validation(required = true)
    public String callbackResult;

    public static ReceiveBenefithubRiskPayRequest build(java.util.Map<String, ?> map) throws Exception {
        ReceiveBenefithubRiskPayRequest self = new ReceiveBenefithubRiskPayRequest();
        return TeaModel.build(map, self);
    }

    public ReceiveBenefithubRiskPayRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public ReceiveBenefithubRiskPayRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public ReceiveBenefithubRiskPayRequest setPlatformCode(String platformCode) {
        this.platformCode = platformCode;
        return this;
    }
    public String getPlatformCode() {
        return this.platformCode;
    }

    public ReceiveBenefithubRiskPayRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

    public ReceiveBenefithubRiskPayRequest setUserUniqueId(String userUniqueId) {
        this.userUniqueId = userUniqueId;
        return this;
    }
    public String getUserUniqueId() {
        return this.userUniqueId;
    }

    public ReceiveBenefithubRiskPayRequest setResultType(String resultType) {
        this.resultType = resultType;
        return this;
    }
    public String getResultType() {
        return this.resultType;
    }

    public ReceiveBenefithubRiskPayRequest setCallbackResult(String callbackResult) {
        this.callbackResult = callbackResult;
        return this;
    }
    public String getCallbackResult() {
        return this.callbackResult;
    }

}
