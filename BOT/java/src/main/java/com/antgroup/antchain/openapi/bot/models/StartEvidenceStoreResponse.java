// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class StartEvidenceStoreResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // API消耗时间（毫秒单位）
    @NameInMap("cost_millis")
    public Long costMillis;

    // 暂保留
    @NameInMap("data_index")
    public String dataIndex;

    // 上链附加备注信息，不做上链存储。
    @NameInMap("ext_info")
    public String extInfo;

    // 交易ID，等于输入参数同名字段
    @NameInMap("nonce")
    public String nonce;

    // 本地unix时间戳（毫秒单位）
    @NameInMap("timestamp")
    public Long timestamp;

    // unix链上存储时间戳
    @NameInMap("tx_timestamp")
    public Long txTimestamp;

    // 链上交易地址txHash
    @NameInMap("tx_hash")
    public String txHash;

    public static StartEvidenceStoreResponse build(java.util.Map<String, ?> map) throws Exception {
        StartEvidenceStoreResponse self = new StartEvidenceStoreResponse();
        return TeaModel.build(map, self);
    }

    public StartEvidenceStoreResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public StartEvidenceStoreResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public StartEvidenceStoreResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public StartEvidenceStoreResponse setCostMillis(Long costMillis) {
        this.costMillis = costMillis;
        return this;
    }
    public Long getCostMillis() {
        return this.costMillis;
    }

    public StartEvidenceStoreResponse setDataIndex(String dataIndex) {
        this.dataIndex = dataIndex;
        return this;
    }
    public String getDataIndex() {
        return this.dataIndex;
    }

    public StartEvidenceStoreResponse setExtInfo(String extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public String getExtInfo() {
        return this.extInfo;
    }

    public StartEvidenceStoreResponse setNonce(String nonce) {
        this.nonce = nonce;
        return this;
    }
    public String getNonce() {
        return this.nonce;
    }

    public StartEvidenceStoreResponse setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public StartEvidenceStoreResponse setTxTimestamp(Long txTimestamp) {
        this.txTimestamp = txTimestamp;
        return this;
    }
    public Long getTxTimestamp() {
        return this.txTimestamp;
    }

    public StartEvidenceStoreResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

}
