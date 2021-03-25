// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class RetryMachinegroupRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 分组 ID
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // retry info
        [NameInMap("retry_info")]
        [Validation(Required=false)]
        public RetryInfo RetryInfo { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
