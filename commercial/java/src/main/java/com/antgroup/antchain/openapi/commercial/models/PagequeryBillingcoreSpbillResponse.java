// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.commercial.models;

import com.aliyun.tea.*;

public class PagequeryBillingcoreSpbillResponse extends TeaModel {
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
    @NameInMap("total_pages")
    public Long totalPages;

    // 当前页码
    @NameInMap("current")
    public Long current;

    // 每页记录数
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total")
    public Long total;

    // 账单列表
    @NameInMap("data")
    public ApBill data;

    public static PagequeryBillingcoreSpbillResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryBillingcoreSpbillResponse self = new PagequeryBillingcoreSpbillResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryBillingcoreSpbillResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryBillingcoreSpbillResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryBillingcoreSpbillResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryBillingcoreSpbillResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

    public PagequeryBillingcoreSpbillResponse setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public PagequeryBillingcoreSpbillResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryBillingcoreSpbillResponse setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public PagequeryBillingcoreSpbillResponse setData(ApBill data) {
        this.data = data;
        return this;
    }
    public ApBill getData() {
        return this.data;
    }

}
