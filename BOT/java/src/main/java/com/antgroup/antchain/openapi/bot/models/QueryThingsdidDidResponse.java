// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryThingsdidDidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询请求返回结构体的数组列表，每一个元素对应一个did
    @NameInMap("did_base_query_resp")
    public java.util.List<DidBaseQueryResp> didBaseQueryResp;

    // 交易唯一ID
    @NameInMap("nonce")
    public String nonce;

    public static QueryThingsdidDidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryThingsdidDidResponse self = new QueryThingsdidDidResponse();
        return TeaModel.build(map, self);
    }

    public QueryThingsdidDidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryThingsdidDidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryThingsdidDidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryThingsdidDidResponse setDidBaseQueryResp(java.util.List<DidBaseQueryResp> didBaseQueryResp) {
        this.didBaseQueryResp = didBaseQueryResp;
        return this;
    }
    public java.util.List<DidBaseQueryResp> getDidBaseQueryResp() {
        return this.didBaseQueryResp;
    }

    public QueryThingsdidDidResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

}
