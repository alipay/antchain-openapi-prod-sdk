// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.windward.models;

import com.aliyun.tea.*;

public class QueryIndividualtaxScoreResponse extends TeaModel {
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

    public static QueryIndividualtaxScoreResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndividualtaxScoreResponse self = new QueryIndividualtaxScoreResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndividualtaxScoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIndividualtaxScoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIndividualtaxScoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIndividualtaxScoreResponse setRange(String range) {
        this.range = range;
        return this;
    }
    public String getRange() {
        return this.range;
    }

}
