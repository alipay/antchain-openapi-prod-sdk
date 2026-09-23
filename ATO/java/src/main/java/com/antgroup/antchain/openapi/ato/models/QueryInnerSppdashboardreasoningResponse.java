// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ato.models;

import com.aliyun.tea.*;

public class QueryInnerSppdashboardreasoningResponse extends TeaModel {
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

    public static QueryInnerSppdashboardreasoningResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryInnerSppdashboardreasoningResponse self = new QueryInnerSppdashboardreasoningResponse();
        return TeaModel.build(map, self);
    }

    public QueryInnerSppdashboardreasoningResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryInnerSppdashboardreasoningResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryInnerSppdashboardreasoningResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryInnerSppdashboardreasoningResponse setModule(String module) {
        this.module = module;
        return this;
    }
    public String getModule() {
        return this.module;
    }

    public QueryInnerSppdashboardreasoningResponse setReasoning(String reasoning) {
        this.reasoning = reasoning;
        return this;
    }
    public String getReasoning() {
        return this.reasoning;
    }

}
