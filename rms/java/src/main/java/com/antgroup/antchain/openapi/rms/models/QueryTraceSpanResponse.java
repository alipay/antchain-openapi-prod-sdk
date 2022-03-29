// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceSpanResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 分页号
    @NameInMap("current_page")
    public Long currentPage;

    // 分页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 查询总数
    @NameInMap("total_size")
    public Long totalSize;

    // 查询总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 搜索出的spans, 查无结果时为空数组
    @NameInMap("spans")
    public java.util.List<TraceSpan> spans;

    // 链路查询结果的关键字段取值集
    @NameInMap("summary")
    public TraceQuerySummary summary;

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

    public QueryTraceSpanResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTraceSpanResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTraceSpanResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryTraceSpanResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryTraceSpanResponse setSpans(java.util.List<TraceSpan> spans) {
        this.spans = spans;
        return this;
    }
    public java.util.List<TraceSpan> getSpans() {
        return this.spans;
    }

    public QueryTraceSpanResponse setSummary(TraceQuerySummary summary) {
        this.summary = summary;
        return this;
    }
    public TraceQuerySummary getSummary() {
        return this.summary;
    }

}
