// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas.models;

import com.aliyun.tea.*;

public class CallbackRightsprodOperationdataRequest extends TeaModel {
    // OAuth模式下的授权token
    @NameInMap("auth_token")
    public String authToken;

    @NameInMap("product_instance_id")
    public String productInstanceId;

    // 通知ID(幂等)
    @NameInMap("notify_id")
    @Validation(required = true)
    public String notifyId;

    // 权益编号
    @NameInMap("rights_code")
    @Validation(required = true)
    public String rightsCode;

    // 凭证编号
    @NameInMap("voucher_code")
    @Validation(required = true)
    public String voucherCode;

    // 业务类型 V_REFUND（退款） V_EXPIRE（过期） V_INVALID（作废） V_USE（核销） V_PUBLISH（发放）
    @NameInMap("biz_type")
    @Validation(required = true)
    public String bizType;

    // 支付订单号（使用和退款 时用于判断是否为重复核销、退款通知）
    @NameInMap("pay_order_no")
    public String payOrderNo;

    // 券面额
    @NameInMap("face_amount")
    public String faceAmount;

    // 流通金额（核销、退款时 金额）
    @NameInMap("flux_amount")
    public String fluxAmount;

    // 业务发生时间
    @NameInMap("biz_time")
    @Validation(required = true)
    public String bizTime;

    public static CallbackRightsprodOperationdataRequest build(java.util.Map<String, ?> map) throws Exception {
        CallbackRightsprodOperationdataRequest self = new CallbackRightsprodOperationdataRequest();
        return TeaModel.build(map, self);
    }

    public CallbackRightsprodOperationdataRequest setAuthToken(String authToken) {
        this.authToken = authToken;
        return this;
    }
    public String getAuthToken() {
        return this.authToken;
    }

    public CallbackRightsprodOperationdataRequest setProductInstanceId(String productInstanceId) {
        this.productInstanceId = productInstanceId;
        return this;
    }
    public String getProductInstanceId() {
        return this.productInstanceId;
    }

    public CallbackRightsprodOperationdataRequest setNotifyId(String notifyId) {
        this.notifyId = notifyId;
        return this;
    }
    public String getNotifyId() {
        return this.notifyId;
    }

    public CallbackRightsprodOperationdataRequest setRightsCode(String rightsCode) {
        this.rightsCode = rightsCode;
        return this;
    }
    public String getRightsCode() {
        return this.rightsCode;
    }

    public CallbackRightsprodOperationdataRequest setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

    public CallbackRightsprodOperationdataRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public CallbackRightsprodOperationdataRequest setPayOrderNo(String payOrderNo) {
        this.payOrderNo = payOrderNo;
        return this;
    }
    public String getPayOrderNo() {
        return this.payOrderNo;
    }

    public CallbackRightsprodOperationdataRequest setFaceAmount(String faceAmount) {
        this.faceAmount = faceAmount;
        return this;
    }
    public String getFaceAmount() {
        return this.faceAmount;
    }

    public CallbackRightsprodOperationdataRequest setFluxAmount(String fluxAmount) {
        this.fluxAmount = fluxAmount;
        return this;
    }
    public String getFluxAmount() {
        return this.fluxAmount;
    }

    public CallbackRightsprodOperationdataRequest setBizTime(String bizTime) {
        this.bizTime = bizTime;
        return this;
    }
    public String getBizTime() {
        return this.bizTime;
    }

}
