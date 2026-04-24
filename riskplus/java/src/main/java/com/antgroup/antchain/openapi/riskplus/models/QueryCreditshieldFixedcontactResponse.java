// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryCreditshieldFixedcontactResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求结果
    @NameInMap("success")
    public Boolean success;

    // MAP<STRING,LIST<STRING>>类型，key为手机号md5，结果为AES加密的修复成功的手机号
    @NameInMap("query_result")
    public java.util.List<String> queryResult;

    public static QueryCreditshieldFixedcontactResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditshieldFixedcontactResponse self = new QueryCreditshieldFixedcontactResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditshieldFixedcontactResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditshieldFixedcontactResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditshieldFixedcontactResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditshieldFixedcontactResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryCreditshieldFixedcontactResponse setQueryResult(java.util.List<String> queryResult) {
        this.queryResult = queryResult;
        return this;
    }
    public java.util.List<String> getQueryResult() {
        return this.queryResult;
    }

}
