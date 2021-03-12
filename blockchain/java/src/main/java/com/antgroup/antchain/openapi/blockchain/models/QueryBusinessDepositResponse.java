// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessDepositResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 具体存证数据
    @NameInMap("deposit_data")
    public String depositData;

    // 业务逻辑对应的存证id
    @NameInMap("deposit_id")
    public String depositId;

    // keyId对应的所有相关的历史交易记录
    @NameInMap("history_tx_hashes")
    public java.util.List<String> historyTxHashes;

    // 是否查询成功
    @NameInMap("status")
    public String status;

    public static QueryBusinessDepositResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessDepositResponse self = new QueryBusinessDepositResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessDepositResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessDepositResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessDepositResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessDepositResponse setDepositData(String depositData) {
        this.depositData = depositData;
        return this;
    }
    public String getDepositData() {
        return this.depositData;
    }

    public QueryBusinessDepositResponse setDepositId(String depositId) {
        this.depositId = depositId;
        return this;
    }
    public String getDepositId() {
        return this.depositId;
    }

    public QueryBusinessDepositResponse setHistoryTxHashes(java.util.List<String> historyTxHashes) {
        this.historyTxHashes = historyTxHashes;
        return this;
    }
    public java.util.List<String> getHistoryTxHashes() {
        return this.historyTxHashes;
    }

    public QueryBusinessDepositResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
