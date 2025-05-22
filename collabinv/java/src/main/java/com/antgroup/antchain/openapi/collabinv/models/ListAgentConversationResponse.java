// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ListAgentConversationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // page_info
    @NameInMap("page_info")
    public PageInfo pageInfo;

    // 会话列表信息
    @NameInMap("conversation_data")
    public java.util.List<ChatConversationInfo> conversationData;

    public static ListAgentConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentConversationResponse self = new ListAgentConversationResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentConversationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAgentConversationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAgentConversationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAgentConversationResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAgentConversationResponse setConversationData(java.util.List<ChatConversationInfo> conversationData) {
        this.conversationData = conversationData;
        return this;
    }
    public java.util.List<ChatConversationInfo> getConversationData() {
        return this.conversationData;
    }

}
