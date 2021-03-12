// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessContractencryptreceiptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // txHash对应的交易内容
    @NameInMap("data")
    public String data;

    // 调用接口是否成功
    @NameInMap("status")
    public Long status;

    // 交易对应的txHash
    @NameInMap("tx_hash")
    public String txHash;

    public static QueryBusinessContractencryptreceiptResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessContractencryptreceiptResponse self = new QueryBusinessContractencryptreceiptResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessContractencryptreceiptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessContractencryptreceiptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessContractencryptreceiptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessContractencryptreceiptResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryBusinessContractencryptreceiptResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryBusinessContractencryptreceiptResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
