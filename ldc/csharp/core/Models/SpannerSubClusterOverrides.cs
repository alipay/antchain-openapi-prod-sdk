// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 统一接入集群子集群覆盖配置项
    public class SpannerSubClusterOverrides : TeaModel {
        // 机房/可用区
        [NameInMap("zone")]
        [Validation(Required=true)]
        public string Zone { get; set; }

        // spanner镜像地址
        [NameInMap("image")]
        [Validation(Required=true)]
        public string Image { get; set; }

    }

}
