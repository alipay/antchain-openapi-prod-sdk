// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acm.models;

import com.aliyun.tea.*;

public class QueryAdminResponse extends TeaModel {
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

    public static QueryAdminResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAdminResponse self = new QueryAdminResponse();
        return TeaModel.build(map, self);
    }

    public QueryAdminResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAdminResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAdminResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAdminResponse setOperators(java.util.List<Operator> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<Operator> getOperators() {
        return this.operators;
    }

}
