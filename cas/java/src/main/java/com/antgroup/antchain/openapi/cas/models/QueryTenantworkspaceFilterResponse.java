// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryTenantworkspaceFilterResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // workspaces
    @NameInMap("data")
    public java.util.List<TenantWorkspace> data;

    public static QueryTenantworkspaceFilterResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTenantworkspaceFilterResponse self = new QueryTenantworkspaceFilterResponse();
        return TeaModel.build(map, self);
    }

    public QueryTenantworkspaceFilterResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTenantworkspaceFilterResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTenantworkspaceFilterResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTenantworkspaceFilterResponse setData(java.util.List<TenantWorkspace> data) {
        this.data = data;
        return this;
    }
    public java.util.List<TenantWorkspace> getData() {
        return this.data;
    }

}
