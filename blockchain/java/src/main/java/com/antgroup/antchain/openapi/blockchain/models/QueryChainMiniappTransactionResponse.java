// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainMiniappTransactionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public ALiYunChainMiniAppTransaction result;

    public static QueryChainMiniappTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChainMiniappTransactionResponse self = new QueryChainMiniappTransactionResponse();
        return TeaModel.build(map, self);
    }

    public QueryChainMiniappTransactionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChainMiniappTransactionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChainMiniappTransactionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChainMiniappTransactionResponse setResult(ALiYunChainMiniAppTransaction result) {
        this.result = result;
        return this;
    }
    public ALiYunChainMiniAppTransaction getResult() {
        return this.result;
    }

}
