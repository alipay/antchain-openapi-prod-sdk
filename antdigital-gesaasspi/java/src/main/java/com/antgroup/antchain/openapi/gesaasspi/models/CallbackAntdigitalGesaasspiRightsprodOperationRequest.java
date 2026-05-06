// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaasspi.models;

import com.aliyun.tea.*;

public class CallbackAntdigitalGesaasspiRightsprodOperationRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 权益编码
    @NameInMap("rights_code")
    @Validation(required = true)
    public String rightsCode;

    // 券码
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    // 通知ID(幂等)
    @NameInMap("notify_id")
    @Validation(required = true)
    public String notifyId;

    // 业务类型
    // V_REFUND（退款）
    // V_EXPIRE（过期）
    // V_INVALID（作废）
    // V_USE（使用）
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 支付订单号
    @NameInMap("pay_order_no")
    public String payOrderNo;

    // 券面额
    @NameInMap("face_amount")
    public String faceAmount;

    // 流通金额（核销、退款时 金额）
    @NameInMap("flux_amount")
    public String fluxAmount;

    public static CallbackAntdigitalGesaasspiRightsprodOperationRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackAntdigitalGesaasspiRightsprodOperationRequest self = new CallbackAntdigitalGesaasspiRightsprodOperationRequest();
        return TeaModel.build(map, self);
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setRightsCode(String rightsCode) {
        this.rightsCode = rightsCode;
        return this;
    }
    public String getRightsCode() {
        return this.rightsCode;
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setNotifyId(String notifyId) {
        this.notifyId = notifyId;
        return this;
    }
    public String getNotifyId() {
        return this.notifyId;
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
        return this;
    }
    public String getPayOrderNo() {
        return this.payOrderNo;
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setFaceAmount(String faceAmount) {
        this.faceAmount = faceAmount;
        return this;
    }
    public String getFaceAmount() {
        return this.faceAmount;
    }

    public CallbackAntdigitalGesaasspiRightsprodOperationRequest setFluxAmount(String fluxAmount) {
        this.fluxAmount = fluxAmount;
        return this;
    }
    public String getFluxAmount() {
        return this.fluxAmount;
    }

}
