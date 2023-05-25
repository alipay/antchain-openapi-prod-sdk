// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class ListClusterImagesRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 目标命名空间
        [NameInMap("namespace")]
        [Validation(Required=false)]
        public string Namespace { get; set; }

        // 工作负载类型
        [NameInMap("workload_types")]
        [Validation(Required=false)]
        public List<string> WorkloadTypes { get; set; }

        // 标签列表
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

    }

}
