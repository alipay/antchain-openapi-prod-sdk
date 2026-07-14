// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.invoice.models;

import com.aliyun.tea.*;

public class QueryIntlamountRcptResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 可开票单列列表
    @NameInMap("detail_list")
    public java.util.List<IntlRcptDetailItem> detailList;

    // 总条数
    @NameInMap("total_count")
    public Long totalCount;

    // 当前页
    @NameInMap("current_page")
    public Long currentPage;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryIntlamountRcptResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIntlamountRcptResponse self = new QueryIntlamountRcptResponse();
        return TeaModel.build(map, self);
    }

    public QueryIntlamountRcptResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryIntlamountRcptResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryIntlamountRcptResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryIntlamountRcptResponse setDetailList(java.util.List<IntlRcptDetailItem> detailList) {
        this.detailList = detailList;
        return this;
    }
    public java.util.List<IntlRcptDetailItem> getDetailList() {
        return this.detailList;
    }

    public QueryIntlamountRcptResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryIntlamountRcptResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryIntlamountRcptResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
