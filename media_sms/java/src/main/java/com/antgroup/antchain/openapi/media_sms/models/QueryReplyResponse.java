// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryReplyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 用户回复结果
    @NameInMap("data")
    public java.util.List<ContentReply> data;

    public static QueryReplyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryReplyResponse self = new QueryReplyResponse();
        return TeaModel.build(map, self);
    }

    public QueryReplyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryReplyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryReplyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryReplyResponse setData(java.util.List<ContentReply> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ContentReply> getData() {
        return this.data;
    }

}
