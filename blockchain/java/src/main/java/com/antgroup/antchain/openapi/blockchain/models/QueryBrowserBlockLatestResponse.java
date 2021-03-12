// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBrowserBlockLatestResponse extends TeaModel {
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
    public java.util.List<BlockchainBrowserLatestBlock> result;

    public static QueryBrowserBlockLatestResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBrowserBlockLatestResponse self = new QueryBrowserBlockLatestResponse();
        return TeaModel.build(map, self);
    }

    public QueryBrowserBlockLatestResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBrowserBlockLatestResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBrowserBlockLatestResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBrowserBlockLatestResponse setResult(java.util.List<BlockchainBrowserLatestBlock> result) {
        this.result = result;
        return this;
    }
    public java.util.List<BlockchainBrowserLatestBlock> getResult() {
        return this.result;
    }

}
