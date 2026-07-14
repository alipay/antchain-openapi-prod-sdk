// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class PagequeryInvoicesApplyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 申请单列表
    @NameInMap("data_list")
    public java.util.List<InvoiceApplyInfoVO> dataList;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 查询结果总数
    @NameInMap("total_count")
    public Long totalCount;

    public static PagequeryInvoicesApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        PagequeryInvoicesApplyResponse self = new PagequeryInvoicesApplyResponse();
        return TeaModel.build(map, self);
    }

    public PagequeryInvoicesApplyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PagequeryInvoicesApplyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PagequeryInvoicesApplyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PagequeryInvoicesApplyResponse setDataList(java.util.List<InvoiceApplyInfoVO> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<InvoiceApplyInfoVO> getDataList() {
        return this.dataList;
    }

    public PagequeryInvoicesApplyResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public PagequeryInvoicesApplyResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public PagequeryInvoicesApplyResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
