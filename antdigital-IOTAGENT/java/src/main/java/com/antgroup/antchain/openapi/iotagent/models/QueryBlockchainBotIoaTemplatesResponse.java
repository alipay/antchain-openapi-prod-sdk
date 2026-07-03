// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.iotagent.models;

import com.aliyun.tea.*;

public class QueryBlockchainBotIoaTemplatesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 智能体模板 VO集合
    @NameInMap("template_agent_list")
    public java.util.List<AgentInfoVO> templateAgentList;

    public static QueryBlockchainBotIoaTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainBotIoaTemplatesResponse self = new QueryBlockchainBotIoaTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainBotIoaTemplatesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainBotIoaTemplatesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainBotIoaTemplatesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainBotIoaTemplatesResponse setTemplateAgentList(java.util.List<AgentInfoVO> templateAgentList) {
        this.templateAgentList = templateAgentList;
        return this;
    }
    public java.util.List<AgentInfoVO> getTemplateAgentList() {
        return this.templateAgentList;
    }

}
