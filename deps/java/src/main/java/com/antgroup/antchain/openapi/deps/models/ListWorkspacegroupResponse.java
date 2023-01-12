// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class ListWorkspacegroupResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 环境列表
    @NameInMap("workspace_groups")
    @Validation(required = true)
    public java.util.List<WorkspaceGroup> workspaceGroups;

    public static ListWorkspacegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWorkspacegroupResponse self = new ListWorkspacegroupResponse();
        return TeaModel.build(map, self);
    }

    public ListWorkspacegroupResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListWorkspacegroupResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListWorkspacegroupResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListWorkspacegroupResponse setWorkspaceGroups(java.util.List<WorkspaceGroup> workspaceGroups) {
        this.workspaceGroups = workspaceGroups;
        return this;
    }
    public java.util.List<WorkspaceGroup> getWorkspaceGroups() {
        return this.workspaceGroups;
    }

}
