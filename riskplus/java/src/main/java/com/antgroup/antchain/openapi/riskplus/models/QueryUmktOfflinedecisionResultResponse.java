// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktOfflinedecisionResultResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 已完成的计划策略集合
    @NameInMap("decision_plan_id_list")
    public java.util.List<Long> decisionPlanIdList;

    // 批次维度圈客任务结果
    @NameInMap("task_exec_batch_info")
    public java.util.List<UmktOfflineDecisionTaskDetailInfo> taskExecBatchInfo;

    public static QueryUmktOfflinedecisionResultResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktOfflinedecisionResultResponse self = new QueryUmktOfflinedecisionResultResponse();
        return TeaModel.build(map, self);
    }

    public QueryUmktOfflinedecisionResultResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUmktOfflinedecisionResultResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUmktOfflinedecisionResultResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUmktOfflinedecisionResultResponse setDecisionPlanIdList(java.util.List<Long> decisionPlanIdList) {
        this.decisionPlanIdList = decisionPlanIdList;
        return this;
    }
    public java.util.List<Long> getDecisionPlanIdList() {
        return this.decisionPlanIdList;
    }

    public QueryUmktOfflinedecisionResultResponse setTaskExecBatchInfo(java.util.List<UmktOfflineDecisionTaskDetailInfo> taskExecBatchInfo) {
        this.taskExecBatchInfo = taskExecBatchInfo;
        return this;
    }
    public java.util.List<UmktOfflineDecisionTaskDetailInfo> getTaskExecBatchInfo() {
        return this.taskExecBatchInfo;
    }

}
