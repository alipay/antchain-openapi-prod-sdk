// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_489f73e9fd5f44c2b5b730d70ea51bf2.models;

import com.aliyun.tea.*;

public class ExecBlockchainAppexContractServiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 合约执行结果
    @NameInMap("response_body")
    public String responseBody;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    public static ExecBlockchainAppexContractServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecBlockchainAppexContractServiceResponse self = new ExecBlockchainAppexContractServiceResponse();
        return TeaModel.build(map, self);
    }

    public ExecBlockchainAppexContractServiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public ExecBlockchainAppexContractServiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ExecBlockchainAppexContractServiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public ExecBlockchainAppexContractServiceResponse setResponseBody(String responseBody) {
        this.responseBody = responseBody;
        return this;
    }
    public String getResponseBody() {
        return this.responseBody;
    }

    public ExecBlockchainAppexContractServiceResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
