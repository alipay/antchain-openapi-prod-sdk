// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CATRONUS.Models
{
    // 集群
    public class Cluster : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 集群名称
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // 环境
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 纳管状态（imported已纳管/unimported未纳管）
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 导入方式
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 白名单
        [NameInMap("namespace_whitelist")]
        [Validation(Required=true)]
        public List<string> NamespaceWhitelist { get; set; }

    }

}
