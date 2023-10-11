// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_aafd16538edd4fc0ab50acd01355adb6.models;

import com.aliyun.tea.*;

public class AuthBlockchainTaxRiskEvaluationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 授权订单订单号
    @NameInMap("order_no")
    public String orderNo;

    // 是否授权成功true是，false否
    @NameInMap("auth_success")
    public Boolean authSuccess;

    // 过期时间，unix时间戳 毫秒
    @NameInMap("expire_time")
    public Long expireTime;

    // 授权时间，unix时间戳 毫秒
    @NameInMap("auth_time")
    public String authTime;

    public static AuthBlockchainTaxRiskEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthBlockchainTaxRiskEvaluationResponse self = new AuthBlockchainTaxRiskEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public AuthBlockchainTaxRiskEvaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AuthBlockchainTaxRiskEvaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AuthBlockchainTaxRiskEvaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AuthBlockchainTaxRiskEvaluationResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public AuthBlockchainTaxRiskEvaluationResponse setAuthSuccess(Boolean authSuccess) {
        this.authSuccess = authSuccess;
        return this;
    }
    public Boolean getAuthSuccess() {
        return this.authSuccess;
    }

    public AuthBlockchainTaxRiskEvaluationResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public AuthBlockchainTaxRiskEvaluationResponse setAuthTime(String authTime) {
        this.authTime = authTime;
        return this;
    }
    public String getAuthTime() {
        return this.authTime;
    }

}
