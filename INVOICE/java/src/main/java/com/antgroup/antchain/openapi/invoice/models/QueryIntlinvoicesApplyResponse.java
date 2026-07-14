// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryIntlinvoicesApplyResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页码
    @NameInMap("current_page")
    public Long currentPage;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 发票申请列表
    @NameInMap("apply_list")
    public java.util.List<IntlInvoiceApplyInfoItem> applyList;

    public static QueryIntlinvoicesApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntlinvoicesApplyResponse self = new QueryIntlinvoicesApplyResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntlinvoicesApplyResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIntlinvoicesApplyResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIntlinvoicesApplyResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIntlinvoicesApplyResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryIntlinvoicesApplyResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIntlinvoicesApplyResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryIntlinvoicesApplyResponse setApplyList(java.util.List<IntlInvoiceApplyInfoItem> applyList) {
        this.applyList = applyList;
        return this;
    }
    public java.util.List<IntlInvoiceApplyInfoItem> getApplyList() {
        return this.applyList;
    }

}
