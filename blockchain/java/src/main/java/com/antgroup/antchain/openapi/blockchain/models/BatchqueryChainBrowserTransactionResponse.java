// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class BatchqueryChainBrowserTransactionResponse extends TeaModel {
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
    public java.util.List<ALiYunLatestTransaction> result;

    public static BatchqueryChainBrowserTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryChainBrowserTransactionResponse self = new BatchqueryChainBrowserTransactionResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryChainBrowserTransactionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public BatchqueryChainBrowserTransactionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public BatchqueryChainBrowserTransactionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public BatchqueryChainBrowserTransactionResponse setResult(java.util.List<ALiYunLatestTransaction> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ALiYunLatestTransaction> getResult() {
        return this.result;
    }

}
