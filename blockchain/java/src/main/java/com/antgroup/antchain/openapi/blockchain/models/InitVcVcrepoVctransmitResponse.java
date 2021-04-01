// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class InitVcVcrepoVctransmitResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 非托管模式下传输vc初始化结果
    @NameInMap("init_result")
    public java.util.List<VcTransmitInitResult> initResult;

    public static InitVcVcrepoVctransmitResponse build(java.util.Map<String, ?> map) throws Exception {
        InitVcVcrepoVctransmitResponse self = new InitVcVcrepoVctransmitResponse();
        return TeaModel.build(map, self);
    }

    public InitVcVcrepoVctransmitResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public InitVcVcrepoVctransmitResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public InitVcVcrepoVctransmitResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public InitVcVcrepoVctransmitResponse setInitResult(java.util.List<VcTransmitInitResult> initResult) {
        this.initResult = initResult;
        return this;
    }
    public java.util.List<VcTransmitInitResult> getInitResult() {
        return this.initResult;
    }

}
