// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktRobotcallResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求时的透传字段
    @NameInMap("out_info")
    public String outInfo;

    // 请求时每个手机号的透传字段
    @NameInMap("customer_out_info")
    public String customerOutInfo;

    // 外呼记录列表
    @NameInMap("call_info")
    public java.util.List<AICallbackMessage> callInfo;

    public static QueryUmktRobotcallResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktRobotcallResponse self = new QueryUmktRobotcallResponse();
        return TeaModel.build(map, self);
    }

    public QueryUmktRobotcallResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUmktRobotcallResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUmktRobotcallResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUmktRobotcallResponse setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public QueryUmktRobotcallResponse setCustomerOutInfo(String customerOutInfo) {
        this.customerOutInfo = customerOutInfo;
        return this;
    }
    public String getCustomerOutInfo() {
        return this.customerOutInfo;
    }

    public QueryUmktRobotcallResponse setCallInfo(java.util.List<AICallbackMessage> callInfo) {
        this.callInfo = callInfo;
        return this;
    }
    public java.util.List<AICallbackMessage> getCallInfo() {
        return this.callInfo;
    }

}
