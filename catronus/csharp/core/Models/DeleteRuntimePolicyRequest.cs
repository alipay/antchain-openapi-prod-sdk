// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class DeleteRuntimePolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 运行时策略命名空间
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 运行时策略名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
