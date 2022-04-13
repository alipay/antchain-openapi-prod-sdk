// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class QuerySidecaropsAllservicesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 用于label到metaservice换取wsgName
        [NameInMap("workspace_group_label")]
        [Validation(Required=true)]
        public string WorkspaceGroupLabel { get; set; }

    }

}
