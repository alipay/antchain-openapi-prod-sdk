// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class RetryBgreleaseArrangementRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 发布概览ID
        [NameInMap("arrangement_id")]
        [Validation(Required=false)]
        public string ArrangementId { get; set; }

        // 发布单
        [NameInMap("plan_id")]
        [Validation(Required=false)]
        public string PlanId { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
