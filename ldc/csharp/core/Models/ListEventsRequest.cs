// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ListEventsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群名
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 容器名称
        [NameInMap("container_name")]
        [Validation(Required=false)]
        public string ContainerName { get; set; }

        // pod名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        //  pod uid
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

        // wsg
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
