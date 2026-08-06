// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class QueryRightsprodVoucherResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户ID
    @NameInMap("user_id")
    public String userId;

    // 用户手机号
    @NameInMap("phone_number")
    public String phoneNumber;

    // 用户openId
    @NameInMap("open_id")
    public String openId;

    // 应用ID
    @NameInMap("app_id")
    public String appId;

    // 供应商权益编码
    @NameInMap("supply_rights_code")
    public String supplyRightsCode;

    // 权益实例ID
    @NameInMap("voucher_code")
    public String voucherCode;

    // 权益名称
    @NameInMap("rights_name")
    public String rightsName;

    // 权益面额
    @NameInMap("face_amount")
    public String faceAmount;

    // 剩余可用金额
    @NameInMap("available_amount")
    public String availableAmount;

    // 权益实例状态
    @NameInMap("status")
    public String status;

    // 过期时间
    @NameInMap("expire_time")
    public String expireTime;

    // 生效时间
    @NameInMap("effect_time")
    public String effectTime;

    public static QueryRightsprodVoucherResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRightsprodVoucherResponse self = new QueryRightsprodVoucherResponse();
        return TeaModel.build(map, self);
    }

    public QueryRightsprodVoucherResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRightsprodVoucherResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRightsprodVoucherResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRightsprodVoucherResponse setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryRightsprodVoucherResponse setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public QueryRightsprodVoucherResponse setOpenId(String openId) {
        this.openId = openId;
        return this;
    }
    public String getOpenId() {
        return this.openId;
    }

    public QueryRightsprodVoucherResponse setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryRightsprodVoucherResponse setSupplyRightsCode(String supplyRightsCode) {
        this.supplyRightsCode = supplyRightsCode;
        return this;
    }
    public String getSupplyRightsCode() {
        return this.supplyRightsCode;
    }

    public QueryRightsprodVoucherResponse setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
        return this;
    }
    public String getVoucherCode() {
        return this.voucherCode;
    }

    public QueryRightsprodVoucherResponse setRightsName(String rightsName) {
        this.rightsName = rightsName;
        return this;
    }
    public String getRightsName() {
        return this.rightsName;
    }

    public QueryRightsprodVoucherResponse setFaceAmount(String faceAmount) {
        this.faceAmount = faceAmount;
        return this;
    }
    public String getFaceAmount() {
        return this.faceAmount;
    }

    public QueryRightsprodVoucherResponse setAvailableAmount(String availableAmount) {
        this.availableAmount = availableAmount;
        return this;
    }
    public String getAvailableAmount() {
        return this.availableAmount;
    }

    public QueryRightsprodVoucherResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryRightsprodVoucherResponse setExpireTime(String expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public String getExpireTime() {
        return this.expireTime;
    }

    public QueryRightsprodVoucherResponse setEffectTime(String effectTime) {
        this.effectTime = effectTime;
        return this;
    }
    public String getEffectTime() {
        return this.effectTime;
    }

}
