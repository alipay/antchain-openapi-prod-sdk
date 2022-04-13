// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateContainerserviceReplicasRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 扩缩容replica详情
        [NameInMap("fixed_replica_elastic_config")]
        [Validation(Required=true)]
        public FixedReplicaElasticConfig FixedReplicaElasticConfig { get; set; }

        // 容器应用服务名称。
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

        // 容器应用服务版本号。
        [NameInMap("revision")]
        [Validation(Required=true)]
        public string Revision { get; set; }

        // 所属工作空间组名称。
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

    }

}
