// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class StartDidVcrepositoryVctransmitResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 具体传输结果
    @NameInMap("result")
    public java.util.List<VcTransmitResult> result;

    public static StartDidVcrepositoryVctransmitResponse build(java.util.Map<String, ?> map) throws Exception {
        StartDidVcrepositoryVctransmitResponse self = new StartDidVcrepositoryVctransmitResponse();
        return TeaModel.build(map, self);
    }

    public StartDidVcrepositoryVctransmitResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartDidVcrepositoryVctransmitResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartDidVcrepositoryVctransmitResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartDidVcrepositoryVctransmitResponse setResult(java.util.List<VcTransmitResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<VcTransmitResult> getResult() {
        return this.result;
    }

}
