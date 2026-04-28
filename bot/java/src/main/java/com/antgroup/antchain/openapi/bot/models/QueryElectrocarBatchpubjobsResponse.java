// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarBatchpubjobsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 批次列表
    @NameInMap("job_list")
    public java.util.List<BatchJobDetail> jobList;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 总页数
    @NameInMap("page_size")
    public Long pageSize;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 状态
    @NameInMap("success")
    public Boolean success;

    public static QueryElectrocarBatchpubjobsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarBatchpubjobsResponse self = new QueryElectrocarBatchpubjobsResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarBatchpubjobsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarBatchpubjobsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarBatchpubjobsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarBatchpubjobsResponse setJobList(java.util.List<BatchJobDetail> jobList) {
        this.jobList = jobList;
        return this;
    }
    public java.util.List<BatchJobDetail> getJobList() {
        return this.jobList;
    }

    public QueryElectrocarBatchpubjobsResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarBatchpubjobsResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarBatchpubjobsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryElectrocarBatchpubjobsResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryElectrocarBatchpubjobsResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
