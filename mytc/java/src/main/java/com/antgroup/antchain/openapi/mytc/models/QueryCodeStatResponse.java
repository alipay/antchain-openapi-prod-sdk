// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.mytc.models;

import com.aliyun.tea.*;

public class QueryCodeStatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 上链交易量
    @NameInMap("transaction_size")
    public Long transactionSize;

    // 上链总数据存储容量占用
    @NameInMap("chain_capacity")
    public Long chainCapacity;

    // 记录条数，包括上链和未上链的总数据条数
    @NameInMap("record_size")
    public Long recordSize;

    // 对重复操作仅做一次记录的数据统计量。eg: 实际溯源码注册量，实际绑定信息的数据量。
    @NameInMap("valid_size")
    public Long validSize;

    public static QueryCodeStatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCodeStatResponse self = new QueryCodeStatResponse();
        return TeaModel.build(map, self);
    }

    public QueryCodeStatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCodeStatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCodeStatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCodeStatResponse setTransactionSize(Long transactionSize) {
        this.transactionSize = transactionSize;
        return this;
    }
    public Long getTransactionSize() {
        return this.transactionSize;
    }

    public QueryCodeStatResponse setChainCapacity(Long chainCapacity) {
        this.chainCapacity = chainCapacity;
        return this;
    }
    public Long getChainCapacity() {
        return this.chainCapacity;
    }

    public QueryCodeStatResponse setRecordSize(Long recordSize) {
        this.recordSize = recordSize;
        return this;
    }
    public Long getRecordSize() {
        return this.recordSize;
    }

    public QueryCodeStatResponse setValidSize(Long validSize) {
        this.validSize = validSize;
        return this;
    }
    public Long getValidSize() {
        return this.validSize;
    }

}
