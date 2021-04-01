// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryApiMiniappbrowserAuthtypeResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求 ID
    @NameInMap("request_id")
    public String requestId;

    // 授权类型
    @NameInMap("result")
    public MiniAppBrowserAuthType result;

    public static QueryApiMiniappbrowserAuthtypeResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryApiMiniappbrowserAuthtypeResponse self = new QueryApiMiniappbrowserAuthtypeResponse();
        return TeaModel.build(map, self);
    }

    public QueryApiMiniappbrowserAuthtypeResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryApiMiniappbrowserAuthtypeResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryApiMiniappbrowserAuthtypeResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryApiMiniappbrowserAuthtypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryApiMiniappbrowserAuthtypeResponse setResult(MiniAppBrowserAuthType result) {
        this.result = result;
        return this;
    }
    public MiniAppBrowserAuthType getResult() {
        return this.result;
    }

}
