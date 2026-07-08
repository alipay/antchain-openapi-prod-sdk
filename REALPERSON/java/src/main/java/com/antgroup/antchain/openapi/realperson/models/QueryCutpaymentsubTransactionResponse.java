// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.realperson.models;

import com.aliyun.tea.*;

public class QueryCutpaymentsubTransactionResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("page_num")
    public String pageNum;

    // 每页数量
    @NameInMap("page_size")
    public String pageSize;

    // 总页数
    @NameInMap("page_count")
    public String pageCount;

    // 银行卡代扣二级租户收支明细
    @NameInMap("transaction_detail_list")
    public java.util.List<TransactionDetail> transactionDetailList;

    public static QueryCutpaymentsubTransactionResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCutpaymentsubTransactionResponse self = new QueryCutpaymentsubTransactionResponse();
        return TeaModel.build(map, self);
    }

    public QueryCutpaymentsubTransactionResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCutpaymentsubTransactionResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCutpaymentsubTransactionResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCutpaymentsubTransactionResponse setPageNum(String pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public String getPageNum() {
        return this.pageNum;
    }

    public QueryCutpaymentsubTransactionResponse setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryCutpaymentsubTransactionResponse setPageCount(String pageCount) {
        this.pageCount = pageCount;
        return this;
    }
    public String getPageCount() {
        return this.pageCount;
    }

    public QueryCutpaymentsubTransactionResponse setTransactionDetailList(java.util.List<TransactionDetail> transactionDetailList) {
        this.transactionDetailList = transactionDetailList;
        return this;
    }
    public java.util.List<TransactionDetail> getTransactionDetailList() {
        return this.transactionDetailList;
    }

}
