// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryWorkspacegroupResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 工作空间组列表。
    @NameInMap("workspace_groups")
    public java.util.List<WorkspaceGroupInfo> workspaceGroups;

    public static QueryWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspacegroupResponse self = new QueryWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorkspacegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWorkspacegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWorkspacegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWorkspacegroupResponse setWorkspaceGroups(java.util.List<WorkspaceGroupInfo> workspaceGroups) {
        this.workspaceGroups = workspaceGroups;
        return this;
    }
    public java.util.List<WorkspaceGroupInfo> getWorkspaceGroups() {
        return this.workspaceGroups;
    }

}
