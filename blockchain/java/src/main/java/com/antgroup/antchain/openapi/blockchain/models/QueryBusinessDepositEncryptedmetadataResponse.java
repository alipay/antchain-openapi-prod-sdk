// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryBusinessDepositEncryptedmetadataResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 被存证的数据
    @NameInMap("deposit_data")
    public String depositData;

    // 存证的唯一主键
    @NameInMap("deposit_id")
    public String depositId;

    // 被存证的主键关联的历史交易
    @NameInMap("history_tx_id")
    public java.util.List<String> historyTxId;

    // 是否查询成功
    @NameInMap("status")
    public String status;

    public static QueryBusinessDepositEncryptedmetadataResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBusinessDepositEncryptedmetadataResponse self = new QueryBusinessDepositEncryptedmetadataResponse();
        return TeaModel.build(map, self);
    }

    public QueryBusinessDepositEncryptedmetadataResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBusinessDepositEncryptedmetadataResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBusinessDepositEncryptedmetadataResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBusinessDepositEncryptedmetadataResponse setDepositData(String depositData) {
        this.depositData = depositData;
        return this;
    }
    public String getDepositData() {
        return this.depositData;
    }

    public QueryBusinessDepositEncryptedmetadataResponse setDepositId(String depositId) {
        this.depositId = depositId;
        return this;
    }
    public String getDepositId() {
        return this.depositId;
    }

    public QueryBusinessDepositEncryptedmetadataResponse setHistoryTxId(java.util.List<String> historyTxId) {
        this.historyTxId = historyTxId;
        return this;
    }
    public java.util.List<String> getHistoryTxId() {
        return this.historyTxId;
    }

    public QueryBusinessDepositEncryptedmetadataResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
