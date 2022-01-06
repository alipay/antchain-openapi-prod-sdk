// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDssStrategyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("strategies")
    public java.util.List<Strategy> strategies;

    public static QueryDssStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDssStrategyResponse self = new QueryDssStrategyResponse();
        return TeaModel.build(map, self);
    }

    public QueryDssStrategyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDssStrategyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDssStrategyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDssStrategyResponse setStrategies(java.util.List<Strategy> strategies) {
        this.strategies = strategies;
        return this;
    }
    public java.util.List<Strategy> getStrategies() {
        return this.strategies;
    }

}
