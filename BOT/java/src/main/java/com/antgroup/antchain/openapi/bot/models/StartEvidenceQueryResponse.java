// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartEvidenceQueryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易在区块链所在块高度
    @NameInMap("block_height")
    public Long blockHeight;

    // API消耗时间（毫秒单位）
    @NameInMap("cost_millis")
    public Long costMillis;

    // 唯一ID，等于输入同名参数
    @NameInMap("nonce")
    public String nonce;

    // unix时间戳(毫秒单位)
    @NameInMap("timestamp")
    public Long timestamp;

    // 区块链交易地址txHash
    @NameInMap("tx_hash")
    public String txHash;

    // 交易存储区块链的链上unix时间戳
    @NameInMap("tx_timestamp")
    public Long txTimestamp;

    // 信物链查询链上获取的数据，参考结构体定义
    @NameInMap("data")
    public EvidenceBaseModel data;

    public static StartEvidenceQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEvidenceQueryResponse self = new StartEvidenceQueryResponse();
        return TeaModel.build(map, self);
    }

    public StartEvidenceQueryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartEvidenceQueryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartEvidenceQueryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartEvidenceQueryResponse setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public StartEvidenceQueryResponse setCostMillis(Long costMillis) {
        this.costMillis = costMillis;
        return this;
    }
    public Long getCostMillis() {
        return this.costMillis;
    }

    public StartEvidenceQueryResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public StartEvidenceQueryResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public StartEvidenceQueryResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public StartEvidenceQueryResponse setTxTimestamp(Long txTimestamp) {
        this.txTimestamp = txTimestamp;
        return this;
    }
    public Long getTxTimestamp() {
        return this.txTimestamp;
    }

    public StartEvidenceQueryResponse setData(EvidenceBaseModel data) {
        this.data = data;
        return this;
    }
    public EvidenceBaseModel getData() {
        return this.data;
    }

}
