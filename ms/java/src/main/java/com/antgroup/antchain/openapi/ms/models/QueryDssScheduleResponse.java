// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.ms.models;

import com.aliyun.tea.*;

public class QueryDssScheduleResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    @NameInMap("page_num")
    public Integer pageNum;

    @NameInMap("page_size")
    public Integer pageSize;

    @NameInMap("tasks")
    public java.util.List<ScheduleTask> tasks;

    @NameInMap("total_count")
    public Integer totalCount;

    public static QueryDssScheduleResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDssScheduleResponse self = new QueryDssScheduleResponse();
        return TeaModel.build(map, self);
    }

    public QueryDssScheduleResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryDssScheduleResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryDssScheduleResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryDssScheduleResponse setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryDssScheduleResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryDssScheduleResponse setTasks(java.util.List<ScheduleTask> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ScheduleTask> getTasks() {
        return this.tasks;
    }

    public QueryDssScheduleResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

}
