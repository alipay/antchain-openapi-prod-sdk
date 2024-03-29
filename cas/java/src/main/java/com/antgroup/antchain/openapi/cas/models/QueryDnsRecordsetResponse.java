// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.cas.models;

import com.aliyun.tea.*;

public class QueryDnsRecordsetResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // data
    @NameInMap("data")
    public java.util.List<WorkspaceDnsRecordset> data;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    // page_size
    @NameInMap("page_size")
    public Long pageSize;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    public static QueryDnsRecordsetResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDnsRecordsetResponse self = new QueryDnsRecordsetResponse();
        return TeaModel.build(map, self);
    }

    public QueryDnsRecordsetResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDnsRecordsetResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDnsRecordsetResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDnsRecordsetResponse setData(java.util.List<WorkspaceDnsRecordset> data) {
        this.data = data;
        return this;
    }
    public java.util.List<WorkspaceDnsRecordset> getData() {
        return this.data;
    }

    public QueryDnsRecordsetResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryDnsRecordsetResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryDnsRecordsetResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

}
