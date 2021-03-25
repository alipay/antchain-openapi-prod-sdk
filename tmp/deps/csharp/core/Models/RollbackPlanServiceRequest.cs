// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class RollbackPlanServiceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 发布单ID
        [NameInMap("plan_id")]
        [Validation(Required=false)]
        public string PlanId { get; set; }

        // rollback_info
        [NameInMap("rollback_info")]
        [Validation(Required=false)]
        public RollbackInfo RollbackInfo { get; set; }

        // 发布服务
        [NameInMap("service")]
        [Validation(Required=false)]
        public string Service { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
