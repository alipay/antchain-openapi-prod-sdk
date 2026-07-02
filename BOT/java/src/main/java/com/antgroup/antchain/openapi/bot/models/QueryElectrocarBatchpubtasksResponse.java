// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.bot.models;

import com.aliyun.tea.*;

public class QueryElectrocarBatchpubtasksResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 任务列表
    @NameInMap("task_list")
    public java.util.List<TaskDetail> taskList;

    // 页码
    @NameInMap("page_num")
    public Long pageNum;

    // 每页条数
    @NameInMap("page_size")
    public Long pageSize;

    // 总页数
    @NameInMap("total_page")
    public Long totalPage;

    // 总记录数
    @NameInMap("total_count")
    public Long totalCount;

    // 状态
    @NameInMap("success")
    public Boolean success;

    public static QueryElectrocarBatchpubtasksResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryElectrocarBatchpubtasksResponse self = new QueryElectrocarBatchpubtasksResponse();
        return TeaModel.build(map, self);
    }

    public QueryElectrocarBatchpubtasksResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryElectrocarBatchpubtasksResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryElectrocarBatchpubtasksResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryElectrocarBatchpubtasksResponse setTaskList(java.util.List<TaskDetail> taskList) {
        this.taskList = taskList;
        return this;
    }
    public java.util.List<TaskDetail> getTaskList() {
        return this.taskList;
    }

    public QueryElectrocarBatchpubtasksResponse setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public QueryElectrocarBatchpubtasksResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryElectrocarBatchpubtasksResponse setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public QueryElectrocarBatchpubtasksResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public QueryElectrocarBatchpubtasksResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
