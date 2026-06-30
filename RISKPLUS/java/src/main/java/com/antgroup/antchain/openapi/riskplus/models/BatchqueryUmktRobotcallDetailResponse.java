// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class BatchqueryUmktRobotcallDetailResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客户请求时的透传字段
    @NameInMap("out_info")
    public String outInfo;

    // 外呼记录列表
    @NameInMap("call_info")
    public java.util.List<CommonRobotCallDetail> callInfo;

    public static BatchqueryUmktRobotcallDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryUmktRobotcallDetailResponse self = new BatchqueryUmktRobotcallDetailResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryUmktRobotcallDetailResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryUmktRobotcallDetailResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryUmktRobotcallDetailResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryUmktRobotcallDetailResponse setOutInfo(String outInfo) {
        this.outInfo = outInfo;
        return this;
    }
    public String getOutInfo() {
        return this.outInfo;
    }

    public BatchqueryUmktRobotcallDetailResponse setCallInfo(java.util.List<CommonRobotCallDetail> callInfo) {
        this.callInfo = callInfo;
        return this;
    }
    public java.util.List<CommonRobotCallDetail> getCallInfo() {
        return this.callInfo;
    }

}
