// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class QueryIpOrderstatisticResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单总数
    @NameInMap("total_order_count")
    public Long totalOrderCount;

    // 总金额
    @NameInMap("total_payment_amount")
    public String totalPaymentAmount;

    // 总客户数
    @NameInMap("total_buyer_count")
    public Long totalBuyerCount;

    // 统计数据
    @NameInMap("order_sta_list")
    public java.util.List<ChannelCounter> orderStaList;

    public static QueryIpOrderstatisticResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIpOrderstatisticResponse self = new QueryIpOrderstatisticResponse();
        return TeaModel.build(map, self);
    }

    public QueryIpOrderstatisticResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIpOrderstatisticResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIpOrderstatisticResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIpOrderstatisticResponse setTotalOrderCount(Long totalOrderCount) {
        this.totalOrderCount = totalOrderCount;
        return this;
    }
    public Long getTotalOrderCount() {
        return this.totalOrderCount;
    }

    public QueryIpOrderstatisticResponse setTotalPaymentAmount(String totalPaymentAmount) {
        this.totalPaymentAmount = totalPaymentAmount;
        return this;
    }
    public String getTotalPaymentAmount() {
        return this.totalPaymentAmount;
    }

    public QueryIpOrderstatisticResponse setTotalBuyerCount(Long totalBuyerCount) {
        this.totalBuyerCount = totalBuyerCount;
        return this;
    }
    public Long getTotalBuyerCount() {
        return this.totalBuyerCount;
    }

    public QueryIpOrderstatisticResponse setOrderStaList(java.util.List<ChannelCounter> orderStaList) {
        this.orderStaList = orderStaList;
        return this;
    }
    public java.util.List<ChannelCounter> getOrderStaList() {
        return this.orderStaList;
    }

}
