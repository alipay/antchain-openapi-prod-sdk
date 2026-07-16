// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.tax.models;

import com.aliyun.tea.*;

public class DescribeIcmInvoiceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 交易hash即txhash
    @NameInMap("txhash")
    public String txhash;

    // 交易块号
    @NameInMap("block_number")
    public String blockNumber;

    // 交易时间
    @NameInMap("timestamp")
    public String timestamp;

    public static DescribeIcmInvoiceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIcmInvoiceResponse self = new DescribeIcmInvoiceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIcmInvoiceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public DescribeIcmInvoiceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public DescribeIcmInvoiceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public DescribeIcmInvoiceResponse setTxhash(String txhash) {
        this.txhash = txhash;
        return this;
    }
    public String getTxhash() {
        return this.txhash;
    }

    public DescribeIcmInvoiceResponse setBlockNumber(String blockNumber) {
        this.blockNumber = blockNumber;
        return this;
    }
    public String getBlockNumber() {
        return this.blockNumber;
    }

    public DescribeIcmInvoiceResponse setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

}
