// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDdsJobsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务信息
    @NameInMap("jobs")
    public java.util.List<Job> jobs;

    // Page number
    @NameInMap("page_num")
    public Integer pageNum;

    // Page size
    @NameInMap("page_size")
    public Integer pageSize;

    // Total item number
    @NameInMap("total_count")
    public Integer totalCount;

    public static QueryDdsJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDdsJobsResponse self = new QueryDdsJobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryDdsJobsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDdsJobsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDdsJobsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDdsJobsResponse setJobs(java.util.List<Job> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<Job> getJobs() {
        return this.jobs;
    }

    public QueryDdsJobsResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryDdsJobsResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDdsJobsResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
