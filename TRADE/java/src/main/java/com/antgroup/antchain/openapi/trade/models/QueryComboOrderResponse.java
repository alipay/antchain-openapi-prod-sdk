// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.trade.models;

import com.aliyun.tea.*;

public class QueryComboOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 套餐订单列表
    @NameInMap("orders")
    public java.util.List<ComboOrder> orders;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页数
    @NameInMap("page_no")
    public Long pageNo;

    // 每页数量
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryComboOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryComboOrderResponse self = new QueryComboOrderResponse();
        return TeaModel.build(map, self);
    }

    public QueryComboOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryComboOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryComboOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryComboOrderResponse setOrders(java.util.List<ComboOrder> orders) {
        this.orders = orders;
        return this;
    }
    public java.util.List<ComboOrder> getOrders() {
        return this.orders;
    }

    public QueryComboOrderResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryComboOrderResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryComboOrderResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
