// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktOfflinedecisionPlandetailsResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 离线圈客关联计划的个数
        [NameInMap("offline_decision_plan_count")]
        [Validation(Required=false)]
        public long? OfflineDecisionPlanCount { get; set; }

        // 离线圈客计划详细
        [NameInMap("plan_detail_list")]
        [Validation(Required=false)]
        public List<OfflineDecisionPlanDetail> PlanDetailList { get; set; }

        // 执行批次维度任务详情信息
        [NameInMap("task_exec_batch_info")]
        [Validation(Required=false)]
        public List<UmktOfflineDecisionTaskExecBatchInfo> TaskExecBatchInfo { get; set; }

    }

}
