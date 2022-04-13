// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ListPodEventsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群名称
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // Pod名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属命名空间名称
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 所属环境名称
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // pod uid
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

    }

}
