// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class CallbackMerchantRiskRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 来源类型
    @NameInMap("source_type")
    @Validation(required = true)
    public String sourceType;

    // 申请单号
    @NameInMap("apply_no")
    @Validation(required = true)
    public String applyNo;

    // 商户号
    @NameInMap("merchant_id")
    @Validation(required = true)
    public String merchantId;

    // 风控结果
    @NameInMap("risk_status")
    @Validation(required = true)
    public String riskStatus;

    // 风控结果码
    @NameInMap("result_code")
    public String resultCode;

    // 风控结果说明
    @NameInMap("result_msg")
    public String resultMsg;

    // 拓展字段
    @NameInMap("extra_info")
    public String extraInfo;

    // 入驻场景
    @NameInMap("scene")
    @Validation(required = true)
    public String scene;

    public static CallbackMerchantRiskRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackMerchantRiskRequest self = new CallbackMerchantRiskRequest();
        return TeaModel.build(map, self);
    }

    public CallbackMerchantRiskRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackMerchantRiskRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackMerchantRiskRequest setSourceType(String sourceType) {
        this.sourceType = sourceType;
        return this;
    }
    public String getSourceType() {
        return this.sourceType;
    }

    public CallbackMerchantRiskRequest setApplyNo(String applyNo) {
        this.applyNo = applyNo;
        return this;
    }
    public String getApplyNo() {
        return this.applyNo;
    }

    public CallbackMerchantRiskRequest setMerchantId(String merchantId) {
        this.merchantId = merchantId;
        return this;
    }
    public String getMerchantId() {
        return this.merchantId;
    }

    public CallbackMerchantRiskRequest setRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }
    public String getRiskStatus() {
        return this.riskStatus;
    }

    public CallbackMerchantRiskRequest setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackMerchantRiskRequest setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackMerchantRiskRequest setExtraInfo(String extraInfo) {
        this.extraInfo = extraInfo;
        return this;
    }
    public String getExtraInfo() {
        return this.extraInfo;
    }

    public CallbackMerchantRiskRequest setScene(String scene) {
        this.scene = scene;
        return this;
    }
    public String getScene() {
        return this.scene;
    }

}
