// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryDeepsecRiskResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 是否调用成功
    @NameInMap("success")
    public Boolean success;

    // 业务返回码
    @NameInMap("code")
    public String code;

    // message	返回信息
    @NameInMap("message")
    public String message;

    // 设备风险标签
    @NameInMap("risk_info")
    public String riskInfo;

    // 设备染色风险标签
    @NameInMap("dc_risk")
    public String dcRisk;

    // 业务风险标签
    @NameInMap("biz_risk")
    public String bizRisk;

    // 设备元数据
    @NameInMap("device_info")
    public String deviceInfo;

    public static QueryDeepsecRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeepsecRiskResponse self = new QueryDeepsecRiskResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeepsecRiskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeepsecRiskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeepsecRiskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeepsecRiskResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryDeepsecRiskResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryDeepsecRiskResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryDeepsecRiskResponse setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo;
        return this;
    }
    public String getRiskInfo() {
        return this.riskInfo;
    }

    public QueryDeepsecRiskResponse setDcRisk(String dcRisk) {
        this.dcRisk = dcRisk;
        return this;
    }
    public String getDcRisk() {
        return this.dcRisk;
    }

    public QueryDeepsecRiskResponse setBizRisk(String bizRisk) {
        this.bizRisk = bizRisk;
        return this;
    }
    public String getBizRisk() {
        return this.bizRisk;
    }

    public QueryDeepsecRiskResponse setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

}
