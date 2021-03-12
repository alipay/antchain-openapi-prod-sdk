// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainResourceConfigResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public java.util.List<ALiYunChainConfigOption> result;

    public static QueryChainResourceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChainResourceConfigResponse self = new QueryChainResourceConfigResponse();
        return TeaModel.build(map, self);
    }

    public QueryChainResourceConfigResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChainResourceConfigResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChainResourceConfigResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChainResourceConfigResponse setResult(java.util.List<ALiYunChainConfigOption> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ALiYunChainConfigOption> getResult() {
        return this.result;
    }

}
