// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpOrderlistResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 页码
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 订单总数
    @NameInMap("total_order_count")
    public Long totalOrderCount;

    // 总金额
    @NameInMap("total_payment_amount")
    public String totalPaymentAmount;

    // 总客户数
    @NameInMap("total_buyer_count")
    public Long totalBuyerCount;

    // 订单列表
    @NameInMap("order_list")
    public java.util.List<IPOrder> orderList;

    // 筛选条件下订单总数
    @NameInMap("select_order_count")
    public Long selectOrderCount;

    public static QueryIpOrderlistResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpOrderlistResponse self = new QueryIpOrderlistResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpOrderlistResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpOrderlistResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpOrderlistResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpOrderlistResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryIpOrderlistResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryIpOrderlistResponse setTotalOrderCount(Long totalOrderCount) {
        this.totalOrderCount = totalOrderCount;
        return this;
    }
    public Long getTotalOrderCount() {
        return this.totalOrderCount;
    }

    public QueryIpOrderlistResponse setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
        return this;
    }
    public String getTotalPaymentAmount() {
        return this.totalPaymentAmount;
    }

    public QueryIpOrderlistResponse setTotalBuyerCount(Long totalBuyerCount) {
        this.totalBuyerCount = totalBuyerCount;
        return this;
    }
    public Long getTotalBuyerCount() {
        return this.totalBuyerCount;
    }

    public QueryIpOrderlistResponse setOrderList(java.util.List<IPOrder> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<IPOrder> getOrderList() {
        return this.orderList;
    }

    public QueryIpOrderlistResponse setSelectOrderCount(Long selectOrderCount) {
        this.selectOrderCount = selectOrderCount;
        return this;
    }
    public Long getSelectOrderCount() {
        return this.selectOrderCount;
    }

}
