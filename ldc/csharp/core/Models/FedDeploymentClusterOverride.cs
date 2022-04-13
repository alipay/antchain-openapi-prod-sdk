// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // FedDeployment cluster override
    public class FedDeploymentClusterOverride : TeaModel {
        // 集群名称
        [NameInMap("cluster")]
        [Validation(Required=true)]
        public string Cluster { get; set; }

        // 集群Deployment replica数量
        [NameInMap("replica")]
        [Validation(Required=true)]
        public long? Replica { get; set; }

        // 环境变量配置覆盖
        [NameInMap("env_var_override")]
        [Validation(Required=true)]
        public List<EnvVarClusterOverride> EnvVarOverride { get; set; }

    }

}
