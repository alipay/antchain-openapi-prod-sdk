// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    public class AddClusterRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群名
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // 环境
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 必为manual
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 命名空间白名单
        [NameInMap("namespace_whitelist")]
        [Validation(Required=true)]
        public List<string> NamespaceWhitelist { get; set; }

        // 新增集群kubeconfig
        [NameInMap("kubeconfig")]
        [Validation(Required=true)]
        public string Kubeconfig { get; set; }

    }

}
