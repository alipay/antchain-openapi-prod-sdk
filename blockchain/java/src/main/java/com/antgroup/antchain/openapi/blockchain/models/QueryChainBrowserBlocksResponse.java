// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryChainBrowserBlocksResponse extends TeaModel {
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
    public java.util.List<ALiYunChainBlockInfo> result;

    public static QueryChainBrowserBlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryChainBrowserBlocksResponse self = new QueryChainBrowserBlocksResponse();
        return TeaModel.build(map, self);
    }

    public QueryChainBrowserBlocksResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryChainBrowserBlocksResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryChainBrowserBlocksResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryChainBrowserBlocksResponse setResult(java.util.List<ALiYunChainBlockInfo> result) {
        this.result = result;
        return this;
    }
    public java.util.List<ALiYunChainBlockInfo> getResult() {
        return this.result;
    }

}
