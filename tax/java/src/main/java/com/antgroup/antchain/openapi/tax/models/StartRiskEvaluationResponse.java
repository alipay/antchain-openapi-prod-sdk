// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class StartRiskEvaluationResponse extends TeaModel {
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
    public String authSuccess;

    // 过期时间，unix时间戳 毫秒
    @NameInMap("expire_time")
    public Long expireTime;

    // 授权时间，unix时间戳 毫秒
    @NameInMap("auth_time")
    public Long authTime;

    // 预测的常驻省份
    @NameInMap("predict_prov_code")
    public String predictProvCode;

    public static StartRiskEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        StartRiskEvaluationResponse self = new StartRiskEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public StartRiskEvaluationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartRiskEvaluationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartRiskEvaluationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartRiskEvaluationResponse setOrderNo(String orderNo) {
        this.orderNo = orderNo;
        return this;
    }
    public String getOrderNo() {
        return this.orderNo;
    }

    public StartRiskEvaluationResponse setAuthSuccess(String authSuccess) {
        this.authSuccess = authSuccess;
        return this;
    }
    public String getAuthSuccess() {
        return this.authSuccess;
    }

    public StartRiskEvaluationResponse setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public StartRiskEvaluationResponse setAuthTime(Long authTime) {
        this.authTime = authTime;
        return this;
    }
    public Long getAuthTime() {
        return this.authTime;
    }

    public StartRiskEvaluationResponse setPredictProvCode(String predictProvCode) {
        this.predictProvCode = predictProvCode;
        return this;
    }
    public String getPredictProvCode() {
        return this.predictProvCode;
    }

}
