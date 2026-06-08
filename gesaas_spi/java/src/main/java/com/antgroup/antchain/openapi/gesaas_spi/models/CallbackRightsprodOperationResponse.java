// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.gesaas_spi.models;

import com.aliyun.tea.*;

public class CallbackRightsprodOperationResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 同步结果  
    // success 为同步成功其他均为失败
    @NameInMap("result")
    public String result;

    public static CallbackRightsprodOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        CallbackRightsprodOperationResponse self = new CallbackRightsprodOperationResponse();
        return TeaModel.build(map, self);
    }

    public CallbackRightsprodOperationResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public CallbackRightsprodOperationResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public CallbackRightsprodOperationResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public CallbackRightsprodOperationResponse setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

}
