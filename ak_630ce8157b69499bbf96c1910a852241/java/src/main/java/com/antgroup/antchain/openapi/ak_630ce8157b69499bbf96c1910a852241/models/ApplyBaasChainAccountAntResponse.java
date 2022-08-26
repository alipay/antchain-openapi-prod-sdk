// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_630ce8157b69499bbf96c1910a852241.models;

import com.aliyun.tea.*;

public class ApplyBaasChainAccountAntResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public ALiYunChainAccount result;

    public static ApplyBaasChainAccountAntResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyBaasChainAccountAntResponse self = new ApplyBaasChainAccountAntResponse();
        return TeaModel.build(map, self);
    }

    public ApplyBaasChainAccountAntResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyBaasChainAccountAntResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyBaasChainAccountAntResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyBaasChainAccountAntResponse setResult(ALiYunChainAccount result) {
        this.result = result;
        return this;
    }
    public ALiYunChainAccount getResult() {
        return this.result;
    }

}
