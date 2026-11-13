// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.smartpromotion.models;

import com.aliyun.tea.*;

public class QueryAntchainAtoInnerSppdashboardreasoningResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 回显领域
    @NameInMap("module")
    public String module;

    // 该领域思考过程（每条 = 时间 + 一句话摘要）
    @NameInMap("reasoning")
    public String reasoning;

    public static QueryAntchainAtoInnerSppdashboardreasoningResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAtoInnerSppdashboardreasoningResponse self = new QueryAntchainAtoInnerSppdashboardreasoningResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAtoInnerSppdashboardreasoningResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningResponse setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public QueryAntchainAtoInnerSppdashboardreasoningResponse setReasoning(String reasoning) {
        this.reasoning = reasoning;
        return this;
    }
    public String getReasoning() {
        return this.reasoning;
    }

}
