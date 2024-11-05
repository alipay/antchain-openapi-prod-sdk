// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.media_sms.models;

import com.aliyun.tea.*;

public class QueryAccountMsgstatusResponse extends TeaModel {
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
    public java.util.List<AccountSmsSendStatus> data;

    public static QueryAccountMsgstatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountMsgstatusResponse self = new QueryAccountMsgstatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAccountMsgstatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAccountMsgstatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAccountMsgstatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAccountMsgstatusResponse setData(java.util.List<AccountSmsSendStatus> data) {
        this.data = data;
        return this;
    }
    public java.util.List<AccountSmsSendStatus> getData() {
        return this.data;
    }

}
