// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetWorkspacegroupTopologyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 所属环境(WorkspaceGroup)名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 地域
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

    }

}
