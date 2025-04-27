// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾离线圈客执行批次信息
    public class UmktOfflineDecisionTaskExecBatchInfo : TeaModel {
        // 执行批次
        [NameInMap("exec_batch")]
        [Validation(Required=true)]
        public string ExecBatch { get; set; }

        // 批次下任务列表
        [NameInMap("offline_decision_task_detail_info_list")]
        [Validation(Required=true)]
        public List<UmktOfflineDecisionTaskDetailInfo> OfflineDecisionTaskDetailInfoList { get; set; }

    }

}
