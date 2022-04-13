// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // Ingress 信息
    public class IngressInfo : TeaModel {
        // 元信息
        [NameInMap("meta")]
        [Validation(Required=true)]
        public ContainerServiceObjectMeta Meta { get; set; }

        // 所属统一接入实例名称
        [NameInMap("unified_access_instance_name")]
        [Validation(Required=false)]
        public string UnifiedAccessInstanceName { get; set; }

    }

}
