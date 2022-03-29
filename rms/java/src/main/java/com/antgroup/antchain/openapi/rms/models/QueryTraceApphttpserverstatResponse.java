// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryTraceApphttpserverstatResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 结果
    @NameInMap("result")
    public java.util.List<TimeSeriesMetrics> result;

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

    public static QueryTraceApphttpserverstatResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryTraceApphttpserverstatResponse self = new QueryTraceApphttpserverstatResponse();
        return TeaModel.build(map, self);
    }

    public QueryTraceApphttpserverstatResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryTraceApphttpserverstatResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryTraceApphttpserverstatResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryTraceApphttpserverstatResponse setResult(java.util.List<TimeSeriesMetrics> result) {
        this.result = result;
        return this;
    }
    public java.util.List<TimeSeriesMetrics> getResult() {
        return this.result;
    }

    public QueryTraceApphttpserverstatResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTraceApphttpserverstatResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTraceApphttpserverstatResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryTraceApphttpserverstatResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

}
