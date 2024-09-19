// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryUmktOfflinedecisionPlandetailsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 离线圈客配置的ID
        [NameInMap("offline_decision_plan_id")]
        [Validation(Required=true)]
        public long? OfflineDecisionPlanId { get; set; }

        // 执行日期
        [NameInMap("result_date")]
        [Validation(Required=true)]
        public string ResultDate { get; set; }

    }

}
