// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdigital.models;

import com.aliyun.tea.*;

public class QueryContractReceiptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果执行结果code，一般为0则表示交易执行成功，非0则表示交易执行过程中发送了异常
    @NameInMap("result")
    public Long result;

    // 交易所在区块高度
    @NameInMap("block_number")
    public Long blockNumber;

    // 交易hash
    @NameInMap("hash")
    public String hash;

    // 该笔交易执行的返回值(base64编码)，一般为合约方法中return的值
    @NameInMap("output")
    public String output;

    public static QueryContractReceiptResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryContractReceiptResponse self = new QueryContractReceiptResponse();
        return TeaModel.build(map, self);
    }

    public QueryContractReceiptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryContractReceiptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryContractReceiptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryContractReceiptResponse setResult(Long result) {
        this.result = result;
        return this;
    }
    public Long getResult() {
        return this.result;
    }

    public QueryContractReceiptResponse setBlockNumber(Long blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public Long getBlockNumber() {
        return this.blockNumber;
    }

    public QueryContractReceiptResponse setHash(String hash) {
        this.hash = hash;
        return this;
    }
    public String getHash() {
        return this.hash;
    }

    public QueryContractReceiptResponse setOutput(String output) {
        this.output = output;
        return this;
    }
    public String getOutput() {
        return this.output;
    }

}
