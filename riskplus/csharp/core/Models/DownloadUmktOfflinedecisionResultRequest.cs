// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class DownloadUmktOfflinedecisionResultRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 离线圈客计划id
        [NameInMap("offline_decision_plan_id")]
        [Validation(Required=true)]
        public long? OfflineDecisionPlanId { get; set; }

        // 圈客计划id
        [NameInMap("decision_plan_id")]
        [Validation(Required=true)]
        public long? DecisionPlanId { get; set; }

        // 圈客结果的产出日期
        // 格式：yyyy-MM-dd
        // 默认当前时间的前一天
        [NameInMap("result_date")]
        [Validation(Required=false)]
        public string ResultDate { get; set; }

        // 离线圈客任务id
        [NameInMap("task_id")]
        [Validation(Required=false)]
        public long? TaskId { get; set; }

    }

}
