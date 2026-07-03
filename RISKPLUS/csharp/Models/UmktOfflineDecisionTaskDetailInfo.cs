// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾离线圈客任务详细信息
    public class UmktOfflineDecisionTaskDetailInfo : TeaModel {
        // 任务id
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public long? TaskId { get; set; }

        // 圈客计划id
        [NameInMap("decision_plan_id")]
        [Validation(Required=true)]
        public long? DecisionPlanId { get; set; }

        // 圈客结果状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>D</para>
        /// </summary>
        [NameInMap("decision_result_status")]
        [Validation(Required=true)]
        public string DecisionResultStatus { get; set; }

        // 圈客结果状态描述
        /// <summary>
        /// <b>Example:</b>
        /// <para>已完成</para>
        /// </summary>
        [NameInMap("status_remark")]
        [Validation(Required=true)]
        public string StatusRemark { get; set; }

    }

}
