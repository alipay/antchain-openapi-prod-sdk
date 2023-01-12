// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryWorkspacegroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
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
