// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aiconumdecision.models;

import com.aliyun.tea.*;

public class QueryBizspaceTaskResponse extends TeaModel {
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
    public TaskInfo taskList;

    public static QueryBizspaceTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryBizspaceTaskResponse self = new QueryBizspaceTaskResponse();
        return TeaModel.build(map, self);
    }

    public QueryBizspaceTaskResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryBizspaceTaskResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryBizspaceTaskResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryBizspaceTaskResponse setTaskList(TaskInfo taskList) {
        this.taskList = taskList;
        return this;
    }
    public TaskInfo getTaskList() {
        return this.taskList;
    }

}
