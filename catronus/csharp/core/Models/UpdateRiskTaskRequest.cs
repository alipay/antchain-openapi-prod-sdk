// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class UpdateRiskTaskRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 风险共担ID
        [NameInMap("risk_task_id")]
        [Validation(Required=true)]
        public string RiskTaskId { get; set; }

        // 风险工单状态
        [NameInMap("state")]
        [Validation(Required=true)]
        public string State { get; set; }

        // 风险责任人
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 安全责任人
        [NameInMap("sec_owner")]
        [Validation(Required=false)]
        public string SecOwner { get; set; }

        // 风险关注人员列表
        [NameInMap("followers")]
        [Validation(Required=false)]
        public List<string> Followers { get; set; }

        // 风险解决方案ID
        [NameInMap("risk_solution_id")]
        [Validation(Required=false)]
        public string RiskSolutionId { get; set; }

    }

}
