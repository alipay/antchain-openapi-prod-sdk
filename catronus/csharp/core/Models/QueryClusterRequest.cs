// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class QueryClusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public string ClusterId { get; set; }

        // 集群名
        [NameInMap("cluster_name")]
        [Validation(Required=false)]
        public string ClusterName { get; set; }

        // 来源
        [NameInMap("source")]
        [Validation(Required=false)]
        public string Source { get; set; }

        // 状态
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

        // 环境
        [NameInMap("env")]
        [Validation(Required=false)]
        public string Env { get; set; }

        // 当前页
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 页大小
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
