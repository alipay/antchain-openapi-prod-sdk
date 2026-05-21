// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.acncontractreview.models;

import com.aliyun.tea.*;

public class QueryAntcloudContractaiAuditRecordResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 当前页
    @NameInMap("page_no")
    public Long pageNo;

    // 页大小
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 审核记录
    @NameInMap("records")
    public java.util.List<AuditRecordItem> records;

    public static QueryAntcloudContractaiAuditRecordResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryAntcloudContractaiAuditRecordResponse self = new QueryAntcloudContractaiAuditRecordResponse();
        return TeaModel.build(map, self);
    }

    public QueryAntcloudContractaiAuditRecordResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryAntcloudContractaiAuditRecordResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryAntcloudContractaiAuditRecordResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryAntcloudContractaiAuditRecordResponse setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public QueryAntcloudContractaiAuditRecordResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryAntcloudContractaiAuditRecordResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryAntcloudContractaiAuditRecordResponse setRecords(java.util.List<AuditRecordItem> records) {
        this.records = records;
        return this;
    }
    public java.util.List<AuditRecordItem> getRecords() {
        return this.records;
    }

}
