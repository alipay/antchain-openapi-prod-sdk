// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryWorkspaceDeltaResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 发生变化的workspace列表
    @NameInMap("workspace_delta_infos")
    @Validation(required = true)
    public java.util.List<WorkspaceDeltaInfo> workspaceDeltaInfos;

    public static QueryWorkspaceDeltaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceDeltaResponse self = new QueryWorkspaceDeltaResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceDeltaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWorkspaceDeltaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWorkspaceDeltaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWorkspaceDeltaResponse setWorkspaceDeltaInfos(java.util.List<WorkspaceDeltaInfo> workspaceDeltaInfos) {
        this.workspaceDeltaInfos = workspaceDeltaInfos;
        return this;
    }
    public java.util.List<WorkspaceDeltaInfo> getWorkspaceDeltaInfos() {
        return this.workspaceDeltaInfos;
    }

}
