// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryWorkspaceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 此应用下所有计算容器分组运维状态详情
    @NameInMap("groups")
    public java.util.List<OpsGroup> groups;

    // 查询结果，workspace列表
    @NameInMap("workspaces")
    public java.util.List<Workspace> workspaces;

    public static QueryWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryWorkspaceResponse self = new QueryWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryWorkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryWorkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryWorkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryWorkspaceResponse setGroups(java.util.List<OpsGroup> groups) {
        this.groups = groups;
        return this;
    }
    public java.util.List<OpsGroup> getGroups() {
        return this.groups;
    }

    public QueryWorkspaceResponse setWorkspaces(java.util.List<Workspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<Workspace> getWorkspaces() {
        return this.workspaces;
    }

}
