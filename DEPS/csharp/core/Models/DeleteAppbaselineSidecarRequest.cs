// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class DeleteAppbaselineSidecarRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 应用基线ID
        [NameInMap("appbaseline_id")]
        [Validation(Required=false)]
        public string AppbaselineId { get; set; }

    }

}
