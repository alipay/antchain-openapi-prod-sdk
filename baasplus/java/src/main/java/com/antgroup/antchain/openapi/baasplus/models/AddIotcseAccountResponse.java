// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasplus.models;

import com.aliyun.tea.*;

public class AddIotcseAccountResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 返回
    @NameInMap("raw_response")
    public String rawResponse;

    public static AddIotcseAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIotcseAccountResponse self = new AddIotcseAccountResponse();
        return TeaModel.build(map, self);
    }

    public AddIotcseAccountResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public AddIotcseAccountResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public AddIotcseAccountResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public AddIotcseAccountResponse setRawResponse(String rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    public String getRawResponse() {
        return this.rawResponse;
    }

}
