// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryAppDeltaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 发生变化的租户列表
    @NameInMap("tenants")
    @Validation(required = true)
    public java.util.List<String> tenants;

    public static QueryAppDeltaResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAppDeltaResponse self = new QueryAppDeltaResponse();
        return TeaModel.build(map, self);
    }

    public QueryAppDeltaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAppDeltaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAppDeltaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAppDeltaResponse setTenants(java.util.List<String> tenants) {
        this.tenants = tenants;
        return this;
    }
    public java.util.List<String> getTenants() {
        return this.tenants;
    }

}
