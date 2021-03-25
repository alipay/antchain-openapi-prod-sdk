// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class CreatePlanOperationRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // data
        [NameInMap("data")]
        [Validation(Required=false)]
        public string Data { get; set; }

        // from_aliyun
        [NameInMap("from_aliyun")]
        [Validation(Required=false)]
        public bool? FromAliyun { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
