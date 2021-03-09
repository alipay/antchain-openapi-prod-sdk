// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryMetaWorkspaceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // workspace 信息
    @NameInMap("data")
    public Workspace data;

    public static QueryMetaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMetaWorkspaceResponse self = new QueryMetaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public QueryMetaWorkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMetaWorkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMetaWorkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMetaWorkspaceResponse setData(Workspace data) {
        this.data = data;
        return this;
    }
    public Workspace getData() {
        return this.data;
    }

}
