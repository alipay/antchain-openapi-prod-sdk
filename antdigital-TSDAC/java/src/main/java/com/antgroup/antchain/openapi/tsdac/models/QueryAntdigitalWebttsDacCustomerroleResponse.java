// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tsdac.models;

import com.aliyun.tea.*;

public class QueryAntdigitalWebttsDacCustomerroleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 客户名称
    @NameInMap("customer_name")
    public String customerName;

    // 操作人ID
    @NameInMap("operator_id")
    public String operatorId;

    // 角色列表
    @NameInMap("roles")
    public java.util.List<RoleItem> roles;

    public static QueryAntdigitalWebttsDacCustomerroleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntdigitalWebttsDacCustomerroleResponse self = new QueryAntdigitalWebttsDacCustomerroleResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntdigitalWebttsDacCustomerroleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntdigitalWebttsDacCustomerroleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntdigitalWebttsDacCustomerroleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntdigitalWebttsDacCustomerroleResponse setCustomerName(String customerName) {
        this.customerName = customerName;
        return this;
    }
    public String getCustomerName() {
        return this.customerName;
    }

    public QueryAntdigitalWebttsDacCustomerroleResponse setOperatorId(String operatorId) {
        this.operatorId = operatorId;
        return this;
    }
    public String getOperatorId() {
        return this.operatorId;
    }

    public QueryAntdigitalWebttsDacCustomerroleResponse setRoles(java.util.List<RoleItem> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<RoleItem> getRoles() {
        return this.roles;
    }

}
