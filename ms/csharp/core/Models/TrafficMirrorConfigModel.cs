// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 流量镜像配置模型
    public class TrafficMirrorConfigModel : TeaModel {
        // 百分比
        [NameInMap("percent")]
        [Validation(Required=false)]
        public long? Percent { get; set; }

        // 放大倍数
        [NameInMap("amplification")]
        [Validation(Required=false)]
        public long? Amplification { get; set; }

    }

}
