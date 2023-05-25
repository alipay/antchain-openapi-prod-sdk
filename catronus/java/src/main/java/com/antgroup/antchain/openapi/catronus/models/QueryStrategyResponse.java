// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.catronus.models;

import com.aliyun.tea.*;

public class QueryStrategyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 策略数组
    @NameInMap("strategy")
    public java.util.List<Strategy> strategy;

    public static QueryStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryStrategyResponse self = new QueryStrategyResponse();
        return TeaModel.build(map, self);
    }

    public QueryStrategyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryStrategyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryStrategyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryStrategyResponse setStrategy(java.util.List<Strategy> strategy) {
        this.strategy = strategy;
        return this;
    }
    public java.util.List<Strategy> getStrategy() {
        return this.strategy;
    }

}
