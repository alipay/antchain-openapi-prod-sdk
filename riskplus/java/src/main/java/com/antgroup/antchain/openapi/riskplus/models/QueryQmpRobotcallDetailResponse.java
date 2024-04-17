// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryQmpRobotcallDetailResponse extends TeaModel {
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

    public static QueryQmpRobotcallDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryQmpRobotcallDetailResponse self = new QueryQmpRobotcallDetailResponse();
        return TeaModel.build(map, self);
    }

    public QueryQmpRobotcallDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryQmpRobotcallDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryQmpRobotcallDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryQmpRobotcallDetailResponse setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public QueryQmpRobotcallDetailResponse setCustomerOutInfo(String customerOutInfo) {
        this.customerOutInfo = customerOutInfo;
        return this;
    }
    public String getCustomerOutInfo() {
        return this.customerOutInfo;
    }

    public QueryQmpRobotcallDetailResponse setCallInfo(java.util.List<AICallbackMessage> callInfo) {
        this.callInfo = callInfo;
        return this;
    }
    public java.util.List<AICallbackMessage> getCallInfo() {
        return this.callInfo;
    }

}
