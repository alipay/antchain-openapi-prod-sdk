// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QueryFlowSitecellRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 异构机房名
        [NameInMap("site_name")]
        [Validation(Required=true)]
        public string SiteName { get; set; }

        // 环境
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
