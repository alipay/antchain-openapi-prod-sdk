// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // lb后端服务器
    public class LbBackendServer : TeaModel {
        // 应用容器名称
        [NameInMap("container_name")]
        [Validation(Required=true)]
        public string ContainerName { get; set; }

        // lb backendServer权值
        [NameInMap("weight")]
        [Validation(Required=true)]
        public long? Weight { get; set; }

        // lb和backendServer关系
        [NameInMap("relation_type")]
        [Validation(Required=true)]
        public string RelationType { get; set; }

        // 环境id
        [NameInMap("env_id")]
        [Validation(Required=true)]
        public string EnvId { get; set; }

    }

}
