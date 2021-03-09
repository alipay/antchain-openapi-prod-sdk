// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class GetWorkspaceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // workspaceDto
    @NameInMap("data")
    public WorkspaceDto data;

    public static GetWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetWorkspaceResponse self = new GetWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public GetWorkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public GetWorkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetWorkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public GetWorkspaceResponse setData(WorkspaceDto data) {
        this.data = data;
        return this;
    }
    public WorkspaceDto getData() {
        return this.data;
    }

}
