// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class GetTraceWorkspacesettingResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 工作空间配置
    @NameInMap("trace_workspace_setting")
    public TraceWorkspaceSetting traceWorkspaceSetting;

    public static GetTraceWorkspacesettingResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTraceWorkspacesettingResponse self = new GetTraceWorkspacesettingResponse();
        return TeaModel.build(map, self);
    }

    public GetTraceWorkspacesettingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetTraceWorkspacesettingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetTraceWorkspacesettingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetTraceWorkspacesettingResponse setTraceWorkspaceSetting(TraceWorkspaceSetting traceWorkspaceSetting) {
        this.traceWorkspaceSetting = traceWorkspaceSetting;
        return this;
    }
    public TraceWorkspaceSetting getTraceWorkspaceSetting() {
        return this.traceWorkspaceSetting;
    }

}
