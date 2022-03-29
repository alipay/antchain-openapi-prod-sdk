// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.rms.models;

import com.aliyun.tea.*;

public class QueryOpsCheckResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // ops_check_results
    @NameInMap("ops_check_results")
    public java.util.List<OpsCheckResult> opsCheckResults;

    // total_count
    @NameInMap("total_count")
    public Long totalCount;

    // current_page
    @NameInMap("current_page")
    public Long currentPage;

    // 页面大小
    @NameInMap("page_size")
    public Long pageSize;

    public static QueryOpsCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryOpsCheckResponse self = new QueryOpsCheckResponse();
        return TeaModel.build(map, self);
    }

    public QueryOpsCheckResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryOpsCheckResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryOpsCheckResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryOpsCheckResponse setOpsCheckResults(java.util.List<OpsCheckResult> opsCheckResults) {
        this.opsCheckResults = opsCheckResults;
        return this;
    }
    public java.util.List<OpsCheckResult> getOpsCheckResults() {
        return this.opsCheckResults;
    }

    public QueryOpsCheckResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryOpsCheckResponse setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryOpsCheckResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
