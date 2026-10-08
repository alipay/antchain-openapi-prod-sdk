// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebttsDacRoleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 角色列表
    @NameInMap("roles")
    public java.util.List<RoleItem> roles;

    public static QueryAntdigitalWebttsDacRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebttsDacRoleResponse self = new QueryAntdigitalWebttsDacRoleResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebttsDacRoleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalWebttsDacRoleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalWebttsDacRoleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalWebttsDacRoleResponse setRoles(java.util.List<RoleItem> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<RoleItem> getRoles() {
        return this.roles;
    }

}
