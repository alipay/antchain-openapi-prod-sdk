// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class QueryUmktOfflinedecisionPlandetailsResponse extends TeaModel {
    // 请求唯一ID，用于链路跟踪和问题排查
    @NameInMap("req_msg_id")
    public String reqMsgId;

    // 结果码，一般OK表示调用成功
    @NameInMap("result_code")
    public String resultCode;

    // 异常信息的文本描述
    @NameInMap("result_msg")
    public String resultMsg;

    // 离线圈客关联计划的个数
    @NameInMap("offline_decision_plan_count")
    public Long offlineDecisionPlanCount;

    // 离线圈客计划详细
    @NameInMap("plan_detail_list")
    public java.util.List<OfflineDecisionPlanDetail> planDetailList;

    // 执行批次维度任务详情信息
    @NameInMap("task_exec_batch_info")
    public java.util.List<UmktOfflineDecisionTaskDetailInfo> taskExecBatchInfo;

    public static QueryUmktOfflinedecisionPlandetailsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryUmktOfflinedecisionPlandetailsResponse self = new QueryUmktOfflinedecisionPlandetailsResponse();
        return TeaModel.build(map, self);
    }

    public QueryUmktOfflinedecisionPlandetailsResponse setReqMsgId(String reqMsgId) {
        this.reqMsgId = reqMsgId;
        return this;
    }
    public String getReqMsgId() {
        return this.reqMsgId;
    }

    public QueryUmktOfflinedecisionPlandetailsResponse setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryUmktOfflinedecisionPlandetailsResponse setResultMsg(String resultMsg) {
        this.resultMsg = resultMsg;
        return this;
    }
    public String getResultMsg() {
        return this.resultMsg;
    }

    public QueryUmktOfflinedecisionPlandetailsResponse setOfflineDecisionPlanCount(Long offlineDecisionPlanCount) {
        this.offlineDecisionPlanCount = offlineDecisionPlanCount;
        return this;
    }
    public Long getOfflineDecisionPlanCount() {
        return this.offlineDecisionPlanCount;
    }

    public QueryUmktOfflinedecisionPlandetailsResponse setPlanDetailList(java.util.List<OfflineDecisionPlanDetail> planDetailList) {
        this.planDetailList = planDetailList;
        return this;
    }
    public java.util.List<OfflineDecisionPlanDetail> getPlanDetailList() {
        return this.planDetailList;
    }

    public QueryUmktOfflinedecisionPlandetailsResponse setTaskExecBatchInfo(java.util.List<UmktOfflineDecisionTaskDetailInfo> taskExecBatchInfo) {
        this.taskExecBatchInfo = taskExecBatchInfo;
        return this;
    }
    public java.util.List<UmktOfflineDecisionTaskDetailInfo> getTaskExecBatchInfo() {
        return this.taskExecBatchInfo;
    }

}
