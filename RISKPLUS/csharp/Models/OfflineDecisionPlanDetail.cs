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
        /// <summary>
        /// <b>Example:</b>
        /// <para>1032</para>
        /// </summary>
        [NameInMap("decision_plan_id")]
        [Validation(Required=true)]
        public string DecisionPlanId { get; set; }

        // 离线圈客执行任务状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ECN</para>
        /// </summary>
        [NameInMap("decision_result_status")]
        [Validation(Required=true)]
        public string DecisionResultStatus { get; set; }

    }

}
