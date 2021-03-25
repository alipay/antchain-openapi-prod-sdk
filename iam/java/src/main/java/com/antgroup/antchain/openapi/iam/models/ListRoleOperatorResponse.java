// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iam.models;

import com.aliyun.tea.*;

public class ListRoleOperatorResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 操作员列表
    @NameInMap("operators")
    @Validation(required = true)
    public java.util.List<Operator> operators;

    public static ListRoleOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRoleOperatorResponse self = new ListRoleOperatorResponse();
        return TeaModel.build(map, self);
    }

    public ListRoleOperatorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListRoleOperatorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListRoleOperatorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListRoleOperatorResponse setOperators(java.util.List<Operator> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<Operator> getOperators() {
        return this.operators;
    }

}
