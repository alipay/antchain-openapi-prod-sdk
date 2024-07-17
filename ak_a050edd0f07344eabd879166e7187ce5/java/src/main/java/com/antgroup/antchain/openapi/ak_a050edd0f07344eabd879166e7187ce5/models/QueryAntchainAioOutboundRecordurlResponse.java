// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_a050edd0f07344eabd879166e7187ce5.models;

import com.aliyun.tea.*;

public class QueryAntchainAioOutboundRecordurlResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 请求是否成功
    // 
    @NameInMap("success")
    public Boolean success;

    // 请求结果说明
    // 
    @NameInMap("message")
    public String message;

    // 录音下载地址
    @NameInMap("data")
    public String data;

    public static QueryAntchainAioOutboundRecordurlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntchainAioOutboundRecordurlResponse self = new QueryAntchainAioOutboundRecordurlResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntchainAioOutboundRecordurlResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntchainAioOutboundRecordurlResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntchainAioOutboundRecordurlResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntchainAioOutboundRecordurlResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryAntchainAioOutboundRecordurlResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAntchainAioOutboundRecordurlResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

}
