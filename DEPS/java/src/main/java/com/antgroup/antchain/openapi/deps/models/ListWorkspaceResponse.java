// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListWorkspaceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // workspace列表。
    @NameInMap("workspaces")
    public java.util.List<Workspace> workspaces;

    public static ListWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspaceResponse self = new ListWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListWorkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListWorkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListWorkspaceResponse setWorkspaces(java.util.List<Workspace> workspaces) {
        this.workspaces = workspaces;
        return this;
    }
    public java.util.List<Workspace> getWorkspaces() {
        return this.workspaces;
    }

}
