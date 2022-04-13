// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Container环境变量集群override
    public class EnvVarClusterOverride : TeaModel {
        // 环境变量名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 环境变量取值
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // Pod容器名称
        [NameInMap("container_name")]
        [Validation(Required=true)]
        public string ContainerName { get; set; }

    }

}
