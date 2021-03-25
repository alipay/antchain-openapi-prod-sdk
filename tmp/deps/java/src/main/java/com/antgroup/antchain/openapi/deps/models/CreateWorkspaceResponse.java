// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class CreateWorkspaceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // workspace
    @NameInMap("workspace")
    public Workspace workspace;

    public static CreateWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkspaceResponse self = new CreateWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public CreateWorkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CreateWorkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CreateWorkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CreateWorkspaceResponse setWorkspace(Workspace workspace) {
        this.workspace = workspace;
        return this;
    }
    public Workspace getWorkspace() {
        return this.workspace;
    }

}
