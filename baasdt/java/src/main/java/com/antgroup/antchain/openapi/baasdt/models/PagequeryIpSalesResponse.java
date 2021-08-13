// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpSalesResponse extends TeaModel {
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

    // IP授权销售数据
    @NameInMap("ip_sales_info_list")
    public java.util.List<IPSalesInfo> ipSalesInfoList;

    // 页码
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    // 销售数据总数
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryIpSalesResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpSalesResponse self = new PagequeryIpSalesResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIpSalesResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIpSalesResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIpSalesResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIpSalesResponse setIpOrderId(String ipOrderId) {
        this.ipOrderId = ipOrderId;
        return this;
    }
    public String getIpOrderId() {
        return this.ipOrderId;
    }

    public PagequeryIpSalesResponse setIpBillId(String ipBillId) {
        this.ipBillId = ipBillId;
        return this;
    }
    public String getIpBillId() {
        return this.ipBillId;
    }

    public PagequeryIpSalesResponse setIpSalesInfoList(java.util.List<IPSalesInfo> ipSalesInfoList) {
        this.ipSalesInfoList = ipSalesInfoList;
        return this;
    }
    public java.util.List<IPSalesInfo> getIpSalesInfoList() {
        return this.ipSalesInfoList;
    }

    public PagequeryIpSalesResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpSalesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpSalesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
