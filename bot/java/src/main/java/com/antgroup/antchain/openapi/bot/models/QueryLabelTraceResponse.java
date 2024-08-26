// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryLabelTraceResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 标签流转历史
    @NameInMap("label_trace_list")
    public java.util.List<LabelTrace> labelTraceList;

    // 当前页码
    @NameInMap("page_index")
    public Long pageIndex;

    // 单页记录数
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total_size")
    public Long totalSize;

    // 总页数
    @NameInMap("total_pages")
    public Long totalPages;

    public static QueryLabelTraceResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLabelTraceResponse self = new QueryLabelTraceResponse();
        return TeaModel.build(map, self);
    }

    public QueryLabelTraceResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryLabelTraceResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLabelTraceResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryLabelTraceResponse setLabelTraceList(java.util.List<LabelTrace> labelTraceList) {
        this.labelTraceList = labelTraceList;
        return this;
    }
    public java.util.List<LabelTrace> getLabelTraceList() {
        return this.labelTraceList;
    }

    public QueryLabelTraceResponse setPageIndex(Long pageIndex) {
        this.pageIndex = pageIndex;
        return this;
    }
    public Long getPageIndex() {
        return this.pageIndex;
    }

    public QueryLabelTraceResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryLabelTraceResponse setTotalSize(Long totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Long getTotalSize() {
        return this.totalSize;
    }

    public QueryLabelTraceResponse setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
        return this;
    }
    public Long getTotalPages() {
        return this.totalPages;
    }

}
