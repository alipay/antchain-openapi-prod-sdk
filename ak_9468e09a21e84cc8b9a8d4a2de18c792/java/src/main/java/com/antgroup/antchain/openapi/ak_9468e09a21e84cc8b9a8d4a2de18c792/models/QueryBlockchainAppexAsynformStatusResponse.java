// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ak_9468e09a21e84cc8b9a8d4a2de18c792.models;

import com.aliyun.tea.*;

public class QueryBlockchainAppexAsynformStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 块高
    // 
    @NameInMap("block_height")
    public Long blockHeight;

    // 交易hash
    // 
    @NameInMap("tx_hash")
    public String txHash;

    // 上传时间
    // 
    @NameInMap("create_time")
    public String createTime;

    // SUCCESS:上链成功, FAILURE:上链失败，UPLOADING:上链中
    @NameInMap("status")
    public String status;

    // 交易时间戳，成功上链时间
    // 
    @NameInMap("tx_timestamp")
    public String txTimestamp;

    public static QueryBlockchainAppexAsynformStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBlockchainAppexAsynformStatusResponse self = new QueryBlockchainAppexAsynformStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryBlockchainAppexAsynformStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBlockchainAppexAsynformStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBlockchainAppexAsynformStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBlockchainAppexAsynformStatusResponse setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public QueryBlockchainAppexAsynformStatusResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryBlockchainAppexAsynformStatusResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryBlockchainAppexAsynformStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryBlockchainAppexAsynformStatusResponse setTxTimestamp(String txTimestamp) {
        this.txTimestamp = txTimestamp;
        return this;
    }
    public String getTxTimestamp() {
        return this.txTimestamp;
    }

}
