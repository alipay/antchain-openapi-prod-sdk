// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotAgentDailysummaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 智能体ID
    @NameInMap("agent_id")
    public String agentId;

    // 总结日期，格式 yyyy-MM-dd
    @NameInMap("date")
    public String date;

    // 总结正文；为空表示尚未生成或当日无对话
    @NameInMap("content")
    public String content;

    // 总结最近更新时间；content 为空时不返回
    @NameInMap("gmt_modified")
    @Validation(pattern = "\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")
    public String gmtModified;

    public static QueryBlockchainBotAgentDailysummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotAgentDailysummaryResponse self = new QueryBlockchainBotAgentDailysummaryResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotAgentDailysummaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotAgentDailysummaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotAgentDailysummaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotAgentDailysummaryResponse setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public QueryBlockchainBotAgentDailysummaryResponse setDate(String date) {
        this.date = date;
        return this;
    }
    public String getDate() {
        return this.date;
    }

    public QueryBlockchainBotAgentDailysummaryResponse setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public QueryBlockchainBotAgentDailysummaryResponse setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

}
