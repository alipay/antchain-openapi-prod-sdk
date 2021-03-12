// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class ExecBlockchainOrderResponse extends TeaModel {
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
    public ALiYunChainExecuteOrder result;

    public static ExecBlockchainOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainOrderResponse self = new ExecBlockchainOrderResponse();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecBlockchainOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecBlockchainOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecBlockchainOrderResponse setResult(ALiYunChainExecuteOrder result) {
        this.result = result;
        return this;
    }
    public ALiYunChainExecuteOrder getResult() {
        return this.result;
    }

}
