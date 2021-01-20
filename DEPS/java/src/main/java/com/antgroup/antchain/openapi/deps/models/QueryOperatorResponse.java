// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.deps.models;

import com.aliyun.tea.*;

public class QueryOperatorResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 操作人列表
    @NameInMap("operators")
    public java.util.List<String> operators;

    public static QueryOperatorResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOperatorResponse self = new QueryOperatorResponse();
        return TeaModel.build(map, self);
    }

    public QueryOperatorResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOperatorResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOperatorResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOperatorResponse setOperators(java.util.List<String> operators) {
        this.operators = operators;
        return this;
    }
    public java.util.List<String> getOperators() {
        return this.operators;
    }

}
