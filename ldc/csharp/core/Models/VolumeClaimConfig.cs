// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 有状态应用数据卷模板配置
    public class VolumeClaimConfig : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // storage_class
        [NameInMap("storage_class")]
        [Validation(Required=false)]
        public string StorageClass { get; set; }

        // resourceRequirementConfig
        [NameInMap("resource_requirement_config")]
        [Validation(Required=false)]
        public ResourceRequirementConfig ResourceRequirementConfig { get; set; }

    }

}
