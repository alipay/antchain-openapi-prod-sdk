// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class DeleteClusterNamespaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // cluster name
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // name of namespace
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
