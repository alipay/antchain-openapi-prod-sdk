// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class QueryWorkspaceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间状态。输入示例：status.1=CREATED
        [NameInMap("status")]
        [Validation(Required=false)]
        public List<string> Status { get; set; }

    }

}
