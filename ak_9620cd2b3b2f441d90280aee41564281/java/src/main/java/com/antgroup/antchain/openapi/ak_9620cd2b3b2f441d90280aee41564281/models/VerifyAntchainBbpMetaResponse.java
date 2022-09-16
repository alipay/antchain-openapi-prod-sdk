// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9620cd2b3b2f441d90280aee41564281.models;

import com.aliyun.tea.*;

public class VerifyAntchainBbpMetaResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 要素认证结果
    @NameInMap("result")
    public CustomerAuthResult result;

    public static VerifyAntchainBbpMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        VerifyAntchainBbpMetaResponse self = new VerifyAntchainBbpMetaResponse();
        return TeaModel.build(map, self);
    }

    public VerifyAntchainBbpMetaResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public VerifyAntchainBbpMetaResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public VerifyAntchainBbpMetaResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public VerifyAntchainBbpMetaResponse setResult(CustomerAuthResult result) {
        this.result = result;
        return this;
    }
    public CustomerAuthResult getResult() {
        return this.result;
    }

}
