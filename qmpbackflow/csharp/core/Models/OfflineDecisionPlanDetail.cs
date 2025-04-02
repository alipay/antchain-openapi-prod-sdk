// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 离线圈客计划详细
    public class OfflineDecisionPlanDetail : TeaModel {
        // 圈客计划ID
        [NameInMap("decision_plan_id")]
        [Validation(Required=true)]
        public string DecisionPlanId { get; set; }

        // 离线圈客执行任务状态
        [NameInMap("decision_result_status")]
        [Validation(Required=true)]
        public string DecisionResultStatus { get; set; }

    }

}
