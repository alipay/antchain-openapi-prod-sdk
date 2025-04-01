// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktOfflinedecisionResultResponse : TeaModel {
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

        // 已完成的计划策略集合
        [NameInMap("decision_plan_id_list")]
        [Validation(Required=false)]
        public List<long?> DecisionPlanIdList { get; set; }

        // 批次维度圈客任务结果
        [NameInMap("task_exec_batch_info")]
        [Validation(Required=false)]
        public List<UmktOfflineDecisionTaskDetailInfo> TaskExecBatchInfo { get; set; }

    }

}
