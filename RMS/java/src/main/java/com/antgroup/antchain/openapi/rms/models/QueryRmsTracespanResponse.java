// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryRmsTracespanResponse extends TeaModel {
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

    // 搜索出的spans, 查无结果时为空数组
    @NameInMap("spans")
    public java.util.List<TraceSpan> spans;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    public static QueryRmsTracespanResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryRmsTracespanResponse self = new QueryRmsTracespanResponse();
        return TeaModel.build(map, self);
    }

    public QueryRmsTracespanResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryRmsTracespanResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryRmsTracespanResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryRmsTracespanResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public QueryRmsTracespanResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryRmsTracespanResponse setSpans(java.util.List<TraceSpan> spans) {
        this.spans = spans;
        return this;
    }
    public java.util.List<TraceSpan> getSpans() {
        return this.spans;
    }

    public QueryRmsTracespanResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
