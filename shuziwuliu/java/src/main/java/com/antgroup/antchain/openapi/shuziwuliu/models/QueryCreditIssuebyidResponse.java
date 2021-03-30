// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditIssuebyidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 信用流转批次号
    @NameInMap("batch_id")
    public String batchId;

    // 批次状态
    @NameInMap("batch_id_status")
    public String batchIdStatus;

    // 凭证发行者did
    @NameInMap("did")
    public String did;

    // 发行凭证列表
    @NameInMap("issue_ids")
    public java.util.List<IssueIdInfo> issueIds;

    // 页数 从1开始
    @NameInMap("page_num")
    public Long pageNum;

    // 每页显示数量
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCreditIssuebyidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditIssuebyidResponse self = new QueryCreditIssuebyidResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditIssuebyidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditIssuebyidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditIssuebyidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditIssuebyidResponse setBatchId(String batchId) {
        this.batchId = batchId;
        return this;
    }
    public String getBatchId() {
        return this.batchId;
    }

    public QueryCreditIssuebyidResponse setBatchIdStatus(String batchIdStatus) {
        this.batchIdStatus = batchIdStatus;
        return this;
    }
    public String getBatchIdStatus() {
        return this.batchIdStatus;
    }

    public QueryCreditIssuebyidResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditIssuebyidResponse setIssueIds(java.util.List<IssueIdInfo> issueIds) {
        this.issueIds = issueIds;
        return this;
    }
    public java.util.List<IssueIdInfo> getIssueIds() {
        return this.issueIds;
    }

    public QueryCreditIssuebyidResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditIssuebyidResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditIssuebyidResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
