// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.appex.models;

import com.aliyun.tea.*;

public class QueryAsynformStatusResponse extends TeaModel {
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

    public static QueryAsynformStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAsynformStatusResponse self = new QueryAsynformStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryAsynformStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAsynformStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAsynformStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAsynformStatusResponse setBlockHeight(Long blockHeight) {
        this.blockHeight = blockHeight;
        return this;
    }
    public Long getBlockHeight() {
        return this.blockHeight;
    }

    public QueryAsynformStatusResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryAsynformStatusResponse setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public QueryAsynformStatusResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public QueryAsynformStatusResponse setTxTimestamp(String txTimestamp) {
        this.txTimestamp = txTimestamp;
        return this;
    }
    public String getTxTimestamp() {
        return this.txTimestamp;
    }

}
