// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.aitech.models;

import com.aliyun.tea.*;

public class PushAdvisormarketAnalysisResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 创建成功后生成的任务唯一 ID。请保存该值，并在查询接口中作为 task_id 使用。
    @NameInMap("task_id")
    public String taskId;

    // 创建成功固定返回 QUEUED，表示任务已进入待人工处理队列，尚未产出分析结果。
    @NameInMap("status")
    public String status;

    public static PushAdvisormarketAnalysisResponse build(java.util.Map<String, ?> map) throws Exception {
        PushAdvisormarketAnalysisResponse self = new PushAdvisormarketAnalysisResponse();
        return TeaModel.build(map, self);
    }

    public PushAdvisormarketAnalysisResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public PushAdvisormarketAnalysisResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public PushAdvisormarketAnalysisResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public PushAdvisormarketAnalysisResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public PushAdvisormarketAnalysisResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
