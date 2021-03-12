// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainBrowserInfoResponse extends TeaModel {
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
    public ALiYunChainInfo result;

    public static QueryChainBrowserInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChainBrowserInfoResponse self = new QueryChainBrowserInfoResponse();
        return TeaModel.build(map, self);
    }

    public QueryChainBrowserInfoResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChainBrowserInfoResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChainBrowserInfoResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChainBrowserInfoResponse setResult(ALiYunChainInfo result) {
        this.result = result;
        return this;
    }
    public ALiYunChainInfo getResult() {
        return this.result;
    }

}
