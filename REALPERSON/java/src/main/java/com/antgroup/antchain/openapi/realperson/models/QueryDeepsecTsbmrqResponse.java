// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryDeepsecTsbmrqResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 设备信息
    @NameInMap("device_info")
    public String deviceInfo;

    // 风险信息标签
    @NameInMap("risk_info")
    public String riskInfo;

    // 业务message
    @NameInMap("message")
    public String message;

    public static QueryDeepsecTsbmrqResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeepsecTsbmrqResponse self = new QueryDeepsecTsbmrqResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeepsecTsbmrqResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDeepsecTsbmrqResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDeepsecTsbmrqResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDeepsecTsbmrqResponse setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public QueryDeepsecTsbmrqResponse setRiskInfo(String riskInfo) {
        this.riskInfo = riskInfo;
        return this;
    }
    public String getRiskInfo() {
        return this.riskInfo;
    }

    public QueryDeepsecTsbmrqResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

}
