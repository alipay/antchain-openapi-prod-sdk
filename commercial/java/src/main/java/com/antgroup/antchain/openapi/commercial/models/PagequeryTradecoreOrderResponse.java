// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PagequeryTradecoreOrderResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总页数
    @NameInMap("pages")
    public Long pages;

    // 当前页码
    @NameInMap("page_num")
    public Long pageNum;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // total
    @NameInMap("total")
    public Long total;

    // order_list
    @NameInMap("order_list")
    public java.util.List<MainOrderVO> orderList;

    public static PagequeryTradecoreOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryTradecoreOrderResponse self = new PagequeryTradecoreOrderResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryTradecoreOrderResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryTradecoreOrderResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryTradecoreOrderResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryTradecoreOrderResponse setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public PagequeryTradecoreOrderResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public PagequeryTradecoreOrderResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryTradecoreOrderResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryTradecoreOrderResponse setOrderList(java.util.List<MainOrderVO> orderList) {
        this.orderList = orderList;
        return this;
    }
    public java.util.List<MainOrderVO> getOrderList() {
        return this.orderList;
    }

}
