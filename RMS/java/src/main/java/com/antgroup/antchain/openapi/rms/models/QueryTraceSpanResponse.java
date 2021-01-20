// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceSpanResponse extends TeaModel {
    @NameInMap("req_msg_id")
    public String reqMsgId;

    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 分页号
    @NameInMap("page_number")
    public Long pageNumber;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 查询总数
    @NameInMap("total_number")
    public Long totalNumber;

    // 搜索出的spans, 查无结果时为空数组
    @NameInMap("spans")
    public java.util.List<TraceSpan> spans;

    public static QueryTraceSpanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceSpanResponse self = new QueryTraceSpanResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceSpanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceSpanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceSpanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceSpanResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryTraceSpanResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTraceSpanResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryTraceSpanResponse setTotalNumber(Long totalNumber) {
        this.totalNumber = totalNumber;
        return this;
    }
    public Long getTotalNumber() {
        return this.totalNumber;
    }

    public QueryTraceSpanResponse setSpans(java.util.List<TraceSpan> spans) {
        this.spans = spans;
        return this;
    }
    public java.util.List<TraceSpan> getSpans() {
        return this.spans;
    }

}
