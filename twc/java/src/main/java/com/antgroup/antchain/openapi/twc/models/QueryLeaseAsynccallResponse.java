// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryLeaseAsynccallResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上链状态
    // TOBE_CHAIN(待上链)
    // CHAINING（上链中）SUCCESS(上链成功)
    // FAIL(上链失败)
    @NameInMap("status")
    public String status;

    // 成功的时候返回txHash
    @NameInMap("tx_hash")
    public String txHash;

    // 上链失败信息，status为FAIL时返回
    @NameInMap("chain_fail_message")
    public String chainFailMessage;

    public static QueryLeaseAsynccallResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLeaseAsynccallResponse self = new QueryLeaseAsynccallResponse();
        return TeaModel.build(map, self);
    }

    public QueryLeaseAsynccallResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLeaseAsynccallResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLeaseAsynccallResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLeaseAsynccallResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryLeaseAsynccallResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryLeaseAsynccallResponse setChainFailMessage(String chainFailMessage) {
        this.chainFailMessage = chainFailMessage;
        return this;
    }
    public String getChainFailMessage() {
        return this.chainFailMessage;
    }

}
