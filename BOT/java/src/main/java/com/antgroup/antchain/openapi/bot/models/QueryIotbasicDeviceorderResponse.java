// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryIotbasicDeviceorderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单明细
    @NameInMap("order_detail")
    public java.util.List<IotBasicDeviceOrderItem> orderDetail;

    // 总记录数
    @NameInMap("total")
    public Long total;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryIotbasicDeviceorderResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIotbasicDeviceorderResponse self = new QueryIotbasicDeviceorderResponse();
        return TeaModel.build(map, self);
    }

    public QueryIotbasicDeviceorderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIotbasicDeviceorderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIotbasicDeviceorderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIotbasicDeviceorderResponse setOrderDetail(java.util.List<IotBasicDeviceOrderItem> orderDetail) {
        this.orderDetail = orderDetail;
        return this;
    }
    public java.util.List<IotBasicDeviceOrderItem> getOrderDetail() {
        return this.orderDetail;
    }

    public QueryIotbasicDeviceorderResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public QueryIotbasicDeviceorderResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryIotbasicDeviceorderResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public QueryIotbasicDeviceorderResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
