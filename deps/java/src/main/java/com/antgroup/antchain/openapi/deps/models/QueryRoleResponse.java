// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryRoleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 角色信息
    @NameInMap("roles")
    public java.util.List<String> roles;

    public static QueryRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRoleResponse self = new QueryRoleResponse();
        return TeaModel.build(map, self);
    }

    public QueryRoleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRoleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRoleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRoleResponse setRoles(java.util.List<String> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<String> getRoles() {
        return this.roles;
    }

}
