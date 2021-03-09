// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListApplicationPackageRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间id，用于做鉴权
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

        // 动态查询
        [NameInMap("dynamic_query")]
        [Validation(Required=false)]
        public DynamicQuery DynamicQuery { get; set; }

        // 应用查询
        [NameInMap("query")]
        [Validation(Required=false)]
        public AppQuery Query { get; set; }

    }

}
