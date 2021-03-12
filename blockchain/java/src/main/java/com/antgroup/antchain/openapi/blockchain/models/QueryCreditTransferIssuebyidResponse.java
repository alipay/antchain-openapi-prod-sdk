// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.blockchain.models;

import com.aliyun.tea.*;

public class QueryCreditTransferIssuebyidResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 异常信息的文本描述
    @NameInMap("result_code")
    public String resultCode;

    @NameInMap("result_msg")
    public String resultMsg;

    // 凭证所属did
    @NameInMap("did")
    public String did;

    // 凭证列表
    @NameInMap("issue_ids")
    public java.util.List<IssueInfo> issueIds;

    // 页数 从1开始
    @NameInMap("page_num")
    public Long pageNum;

    // 每页显示数量
    @NameInMap("page_size")
    public Long pageSize;

    // 数据总量
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCreditTransferIssuebyidResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditTransferIssuebyidResponse self = new QueryCreditTransferIssuebyidResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditTransferIssuebyidResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditTransferIssuebyidResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditTransferIssuebyidResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditTransferIssuebyidResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditTransferIssuebyidResponse setIssueIds(java.util.List<IssueInfo> issueIds) {
        this.issueIds = issueIds;
        return this;
    }
    public java.util.List<IssueInfo> getIssueIds() {
        return this.issueIds;
    }

    public QueryCreditTransferIssuebyidResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditTransferIssuebyidResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditTransferIssuebyidResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
