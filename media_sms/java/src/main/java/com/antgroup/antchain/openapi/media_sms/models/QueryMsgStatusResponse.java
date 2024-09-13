// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryMsgStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 信息发送状态
    @NameInMap("data")
    public java.util.List<SmsSendStatus> data;

    public static QueryMsgStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryMsgStatusResponse self = new QueryMsgStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryMsgStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryMsgStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryMsgStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryMsgStatusResponse setData(java.util.List<SmsSendStatus> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SmsSendStatus> getData() {
        return this.data;
    }

}
