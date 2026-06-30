// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.securitytech.models;

import com.aliyun.tea.*;

public class RunXhunterSpiResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // response
    @NameInMap("response")
    public String response;

    public static RunXhunterSpiResponse build(java.util.Map<String, ?> map) throws Exception {
        RunXhunterSpiResponse self = new RunXhunterSpiResponse();
        return TeaModel.build(map, self);
    }

    public RunXhunterSpiResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public RunXhunterSpiResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public RunXhunterSpiResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public RunXhunterSpiResponse setResponse(String response) {
        this.response = response;
        return this;
    }
    public String getResponse() {
        return this.response;
    }

}
