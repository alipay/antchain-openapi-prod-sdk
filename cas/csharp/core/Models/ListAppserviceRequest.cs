// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListAppserviceRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 动态查询
        [NameInMap("dynamic_query")]
        [Validation(Required=false)]
        public DynamicQuery DynamicQuery { get; set; }

        // 应用服务查询
        [NameInMap("query")]
        [Validation(Required=false)]
        public AppServiceQuery Query { get; set; }

        // 工作空间id，用于鉴权
        [NameInMap("workspace_id")]
        [Validation(Required=true)]
        public string WorkspaceId { get; set; }

    }

}
