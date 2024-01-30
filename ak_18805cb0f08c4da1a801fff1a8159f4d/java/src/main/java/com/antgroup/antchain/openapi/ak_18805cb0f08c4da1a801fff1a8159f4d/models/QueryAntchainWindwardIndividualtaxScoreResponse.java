// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_18805cb0f08c4da1a801fff1a8159f4d.models;

import com.aliyun.tea.*;

public class QueryAntchainWindwardIndividualtaxScoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分数区间
    @NameInMap("range")
    public String range;

    public static QueryAntchainWindwardIndividualtaxScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainWindwardIndividualtaxScoreResponse self = new QueryAntchainWindwardIndividualtaxScoreResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainWindwardIndividualtaxScoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainWindwardIndividualtaxScoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainWindwardIndividualtaxScoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainWindwardIndividualtaxScoreResponse setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

}
