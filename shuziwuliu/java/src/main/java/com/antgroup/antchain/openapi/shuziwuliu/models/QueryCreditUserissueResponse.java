// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.shuziwuliu.models;

import com.aliyun.tea.*;

public class QueryCreditUserissueResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 凭证所有者分布式数字身份
    @NameInMap("did")
    public String did;

    // 信用流转凭证列表
    @NameInMap("issue_ids")
    public java.util.List<UserIssueId> issueIds;

    // 页数
    @NameInMap("page_num")
    public Long pageNum;

    // 每页显示最大条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总数
    @NameInMap("total_count")
    public Long totalCount;

    public static QueryCreditUserissueResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryCreditUserissueResponse self = new QueryCreditUserissueResponse();
        return TeaModel.build(map, self);
    }

    public QueryCreditUserissueResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryCreditUserissueResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryCreditUserissueResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryCreditUserissueResponse setDid(String did) {
        this.did = did;
        return this;
    }
    public String getDid() {
        return this.did;
    }

    public QueryCreditUserissueResponse setIssueIds(java.util.List<UserIssueId> issueIds) {
        this.issueIds = issueIds;
        return this;
    }
    public java.util.List<UserIssueId> getIssueIds() {
        return this.issueIds;
    }

    public QueryCreditUserissueResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryCreditUserissueResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryCreditUserissueResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

}
