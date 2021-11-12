// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpSalessummaryResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 订单ID
    @NameInMap("ip_order_id")
    public String ipOrderId;

    // 账单ID
    @NameInMap("ip_bill_id")
    public String ipBillId;

    // 销售数据汇总信息列表
    @NameInMap("ip_sales_summary_list")
    public java.util.List<IPSalesSummary> ipSalesSummaryList;

    // 页码
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 销售数据总数
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryIpSalessummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpSalessummaryResponse self = new PagequeryIpSalessummaryResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIpSalessummaryResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIpSalessummaryResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIpSalessummaryResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIpSalessummaryResponse setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public PagequeryIpSalessummaryResponse setIpBillId(String ipBillId) {
        this.ipBillId = ipBillId;
        return this;
    }
    public String getIpBillId() {
        return this.ipBillId;
    }

    public PagequeryIpSalessummaryResponse setIpSalesSummaryList(java.util.List<IPSalesSummary> ipSalesSummaryList) {
        this.ipSalesSummaryList = ipSalesSummaryList;
        return this;
    }
    public java.util.List<IPSalesSummary> getIpSalesSummaryList() {
        return this.ipSalesSummaryList;
    }

    public PagequeryIpSalessummaryResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpSalessummaryResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpSalessummaryResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
