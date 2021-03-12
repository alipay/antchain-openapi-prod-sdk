// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessContractreceiptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 链上txHash对应的内容
    @NameInMap("data")
    public String data;

    // 接口调用是否成功
    @NameInMap("status")
    public Long status;

    // 对应的链上交易txHash
    @NameInMap("tx_hash")
    public String txHash;

    public static QueryBusinessContractreceiptResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessContractreceiptResponse self = new QueryBusinessContractreceiptResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessContractreceiptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessContractreceiptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessContractreceiptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessContractreceiptResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryBusinessContractreceiptResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryBusinessContractreceiptResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
