// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ApplyChainCertAntResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // result
    @NameInMap("result")
    public ALiYunChainDownload result;

    public static ApplyChainCertAntResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyChainCertAntResponse self = new ApplyChainCertAntResponse();
        return TeaModel.build(map, self);
    }

    public ApplyChainCertAntResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ApplyChainCertAntResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ApplyChainCertAntResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ApplyChainCertAntResponse setResult(ALiYunChainDownload result) {
        this.result = result;
        return this;
    }
    public ALiYunChainDownload getResult() {
        return this.result;
    }

}
