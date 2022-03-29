// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class ListTraceWorkspacesettingResponse extends TeaModel {
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
    @NameInMap("trace_workspace_settings")
    public java.util.List<TraceWorkspaceSetting> traceWorkspaceSettings;

    public static ListTraceWorkspacesettingResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTraceWorkspacesettingResponse self = new ListTraceWorkspacesettingResponse();
        return TeaModel.build(map, self);
    }

    public ListTraceWorkspacesettingResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListTraceWorkspacesettingResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListTraceWorkspacesettingResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListTraceWorkspacesettingResponse setTraceWorkspaceSettings(java.util.List<TraceWorkspaceSetting> traceWorkspaceSettings) {
        this.traceWorkspaceSettings = traceWorkspaceSettings;
        return this;
    }
    public java.util.List<TraceWorkspaceSetting> getTraceWorkspaceSettings() {
        return this.traceWorkspaceSettings;
    }

}
