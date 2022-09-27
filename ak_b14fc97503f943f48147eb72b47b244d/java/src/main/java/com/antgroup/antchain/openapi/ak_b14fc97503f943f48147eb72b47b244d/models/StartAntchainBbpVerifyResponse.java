// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_b14fc97503f943f48147eb72b47b244d.models;

import com.aliyun.tea.*;

public class StartAntchainBbpVerifyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 核身渲染结果
    @NameInMap("result")
    public java.util.List<GwVerifyViewResult> result;

    public static StartAntchainBbpVerifyResponse build(java.util.Map<String, ?> map) throws Exception {
        StartAntchainBbpVerifyResponse self = new StartAntchainBbpVerifyResponse();
        return TeaModel.build(map, self);
    }

    public StartAntchainBbpVerifyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartAntchainBbpVerifyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartAntchainBbpVerifyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartAntchainBbpVerifyResponse setResult(java.util.List<GwVerifyViewResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GwVerifyViewResult> getResult() {
        return this.result;
    }

}
