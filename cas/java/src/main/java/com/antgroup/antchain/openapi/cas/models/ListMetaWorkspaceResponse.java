// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListMetaWorkspaceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 工作空间详细信息列表
    @NameInMap("data")
    public java.util.List<Workspace> data;

    public static ListMetaWorkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMetaWorkspaceResponse self = new ListMetaWorkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListMetaWorkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListMetaWorkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListMetaWorkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListMetaWorkspaceResponse setData(java.util.List<Workspace> data) {
        this.data = data;
        return this;
    }
    public java.util.List<Workspace> getData() {
        return this.data;
    }

}
