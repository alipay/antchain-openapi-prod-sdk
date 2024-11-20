// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryRdaasTaxSimpleauthdecisionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // json决策结果
    @NameInMap("data")
    public String data;

    public static QueryRdaasTaxSimpleauthdecisionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRdaasTaxSimpleauthdecisionResponse self = new QueryRdaasTaxSimpleauthdecisionResponse();
        return TeaModel.build(map, self);
    }

    public QueryRdaasTaxSimpleauthdecisionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRdaasTaxSimpleauthdecisionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRdaasTaxSimpleauthdecisionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRdaasTaxSimpleauthdecisionResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
