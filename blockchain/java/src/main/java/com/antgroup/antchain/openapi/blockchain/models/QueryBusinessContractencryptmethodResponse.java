// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessContractencryptmethodResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 查询方法返回值
    @NameInMap("data")
    public String data;

    // 是否接口调用成功
    @NameInMap("status")
    public Long status;

    // 该查询方法在链上所发的交易
    @NameInMap("tx_hash")
    public String txHash;

    public static QueryBusinessContractencryptmethodResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessContractencryptmethodResponse self = new QueryBusinessContractencryptmethodResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessContractencryptmethodResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessContractencryptmethodResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessContractencryptmethodResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessContractencryptmethodResponse setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public QueryBusinessContractencryptmethodResponse setStatus(Long status) {
        this.status = status;
        return this;
    }
    public Long getStatus() {
        return this.status;
    }

    public QueryBusinessContractencryptmethodResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
