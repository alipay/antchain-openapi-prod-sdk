// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.twc.models;

import com.aliyun.tea.*;

public class QueryContractStatusResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易hash
    @NameInMap("tx_hash")
    public String txHash;

    // 订单id
    @NameInMap("order_id")
    public String orderId;

    // 合约执行结果，Base64编码后的
    @NameInMap("content_base64")
    public String contentBase64;

    // 块高
    @NameInMap("block_number")
    public Long blockNumber;

    // 消耗gas量
    @NameInMap("gas_used")
    public Long gasUsed;

    // log信息
    @NameInMap("log_base64")
    public String logBase64;

    public static QueryContractStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractStatusResponse self = new QueryContractStatusResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractStatusResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractStatusResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractStatusResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractStatusResponse setTxHash(String txHash) {
        this.txHash = txHash;
        return this;
    }
    public String getTxHash() {
        return this.txHash;
    }

    public QueryContractStatusResponse setOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }
    public String getOrderId() {
        return this.orderId;
    }

    public QueryContractStatusResponse setContentBase64(String contentBase64) {
        this.contentBase64 = contentBase64;
        return this;
    }
    public String getContentBase64() {
        return this.contentBase64;
    }

    public QueryContractStatusResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public QueryContractStatusResponse setGasUsed(Long gasUsed) {
        this.gasUsed = gasUsed;
        return this;
    }
    public Long getGasUsed() {
        return this.gasUsed;
    }

    public QueryContractStatusResponse setLogBase64(String logBase64) {
        this.logBase64 = logBase64;
        return this;
    }
    public String getLogBase64() {
        return this.logBase64;
    }

}
