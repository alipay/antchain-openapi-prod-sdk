// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 资源规格
    public class ResourceSpec : TeaModel {
        // cpu规格
        [NameInMap("cpu")]
        [Validation(Required=true)]
        public string Cpu { get; set; }

        // gpu规格
        [NameInMap("gpu")]
        [Validation(Required=false)]
        public string Gpu { get; set; }

        // memory
        [NameInMap("memory")]
        [Validation(Required=true)]
        public string Memory { get; set; }

        // 规格名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 应用副本数
        [NameInMap("replicas")]
        [Validation(Required=true)]
        public long? Replicas { get; set; }

        // 数据卷规格
        [NameInMap("volumes")]
        [Validation(Required=true)]
        public List<VolumeSpec> Volumes { get; set; }

    }

}
