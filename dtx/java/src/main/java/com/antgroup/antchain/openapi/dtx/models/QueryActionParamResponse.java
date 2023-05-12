// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.dtx.models;

import com.aliyun.tea.*;

public class QueryActionParamResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 参数列表
    @NameInMap("params")
    public java.util.List<Pair> params;

    public static QueryActionParamResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryActionParamResponse self = new QueryActionParamResponse();
        return TeaModel.build(map, self);
    }

    public QueryActionParamResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryActionParamResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryActionParamResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryActionParamResponse setParams(java.util.List<Pair> params) {
        this.params = params;
        return this;
    }
    public java.util.List<Pair> getParams() {
        return this.params;
    }

}
