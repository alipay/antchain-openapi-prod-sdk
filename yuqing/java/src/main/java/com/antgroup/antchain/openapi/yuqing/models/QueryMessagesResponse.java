// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.yuqing.models;

import com.aliyun.tea.*;

public class QueryMessagesResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 数量
    @NameInMap("total_count")
    public Long totalCount;

    // 舆情列表
    @NameInMap("yuqing_messages")
    public java.util.List<YuqingMessage> yuqingMessages;

    public static QueryMessagesResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMessagesResponse self = new QueryMessagesResponse();
        return TeaModel.build(map, self);
    }

    public QueryMessagesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMessagesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMessagesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMessagesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryMessagesResponse setYuqingMessages(java.util.List<YuqingMessage> yuqingMessages) {
        this.yuqingMessages = yuqingMessages;
        return this;
    }
    public java.util.List<YuqingMessage> getYuqingMessages() {
        return this.yuqingMessages;
    }

}
