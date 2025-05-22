// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.collabinv.models;

import com.aliyun.tea.*;

public class ListAgentMessageResponse extends TeaModel {
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

    // 消息列表
    @NameInMap("message_data")
    public java.util.List<ChatMessageInfo> messageData;

    public static ListAgentMessageResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAgentMessageResponse self = new ListAgentMessageResponse();
        return TeaModel.build(map, self);
    }

    public ListAgentMessageResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ListAgentMessageResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListAgentMessageResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ListAgentMessageResponse setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public PageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAgentMessageResponse setMessageData(java.util.List<ChatMessageInfo> messageData) {
        this.messageData = messageData;
        return this;
    }
    public java.util.List<ChatMessageInfo> getMessageData() {
        return this.messageData;
    }

}
