// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class SkipClusterBaselineRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 资源名称
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 资源命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 资源id
        [NameInMap("resource_id")]
        [Validation(Required=true)]
        public string ResourceId { get; set; }

        // 资源类型
        [NameInMap("kind")]
        [Validation(Required=false)]
        public string Kind { get; set; }

    }

}
