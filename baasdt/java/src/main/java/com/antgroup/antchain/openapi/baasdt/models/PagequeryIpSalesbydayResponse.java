// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.baasdt.models;

import com.aliyun.tea.*;

public class PagequeryIpSalesbydayResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 页码
    @NameInMap("page_number")
    public Long pageNumber;

    // 页面数据量大小
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总数
    @NameInMap("total_count")
    public Long totalCount;

    // T+1日的销售数据统计数据列表
    @NameInMap("sales_b_day_list")
    public java.util.List<SalesByDay> salesBDayList;

    public static PagequeryIpSalesbydayResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryIpSalesbydayResponse self = new PagequeryIpSalesbydayResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryIpSalesbydayResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryIpSalesbydayResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryIpSalesbydayResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryIpSalesbydayResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public PagequeryIpSalesbydayResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryIpSalesbydayResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public PagequeryIpSalesbydayResponse setSalesBDayList(java.util.List<SalesByDay> salesBDayList) {
        this.salesBDayList = salesBDayList;
        return this;
    }
    public java.util.List<SalesByDay> getSalesBDayList() {
        return this.salesBDayList;
    }

}
