// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class ListTenantworkspaceResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // worksapce列表
    @NameInMap("data")
    public java.util.List<TenantWorkspace> data;

    public static ListTenantworkspaceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListTenantworkspaceResponse self = new ListTenantworkspaceResponse();
        return TeaModel.build(map, self);
    }

    public ListTenantworkspaceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListTenantworkspaceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListTenantworkspaceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListTenantworkspaceResponse setData(java.util.List<TenantWorkspace> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TenantWorkspace> getData() {
        return this.data;
    }

}
