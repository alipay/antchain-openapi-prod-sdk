// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryScfleaseEqpinfoResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询结果
    @NameInMap("result")
    public java.util.List<ScfLeaseEqpInfo> result;

    // 成功/失败
    @NameInMap("success")
    public Boolean success;

    public static QueryScfleaseEqpinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryScfleaseEqpinfoResponse self = new QueryScfleaseEqpinfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryScfleaseEqpinfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryScfleaseEqpinfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryScfleaseEqpinfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryScfleaseEqpinfoResponse setResult(java.util.List<ScfLeaseEqpInfo> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ScfLeaseEqpInfo> getResult() {
        return this.result;
    }

    public QueryScfleaseEqpinfoResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
