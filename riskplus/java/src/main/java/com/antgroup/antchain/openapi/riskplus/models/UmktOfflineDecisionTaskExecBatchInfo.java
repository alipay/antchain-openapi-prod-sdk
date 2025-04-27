// This file is auto-generated, don't edit it. Thanks.
package com.antgroup.antchain.openapi.riskplus.models;

import com.aliyun.tea.*;

public class UmktOfflineDecisionTaskExecBatchInfo extends TeaModel {
    // 执行批次
    @NameInMap("exec_batch")
    @Validation(required = true)
    public String execBatch;

    // 批次下任务列表
    @NameInMap("offline_decision_task_detail_info_list")
    @Validation(required = true)
    public java.util.List<UmktOfflineDecisionTaskDetailInfo> offlineDecisionTaskDetailInfoList;

    public static UmktOfflineDecisionTaskExecBatchInfo build(java.util.Map<String, ?> map) throws Exception {
        UmktOfflineDecisionTaskExecBatchInfo self = new UmktOfflineDecisionTaskExecBatchInfo();
        return TeaModel.build(map, self);
    }

    public UmktOfflineDecisionTaskExecBatchInfo setExecBatch(String execBatch) {
        this.execBatch = execBatch;
        return this;
    }
    public String getExecBatch() {
        return this.execBatch;
    }

    public UmktOfflineDecisionTaskExecBatchInfo setOfflineDecisionTaskDetailInfoList(java.util.List<UmktOfflineDecisionTaskDetailInfo> offlineDecisionTaskDetailInfoList) {
        this.offlineDecisionTaskDetailInfoList = offlineDecisionTaskDetailInfoList;
        return this;
    }
    public java.util.List<UmktOfflineDecisionTaskDetailInfo> getOfflineDecisionTaskDetailInfoList() {
        return this.offlineDecisionTaskDetailInfoList;
    }

}
