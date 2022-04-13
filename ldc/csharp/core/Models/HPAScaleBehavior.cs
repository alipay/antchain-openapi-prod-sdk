// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // 扩缩容策略高级配置项
    public class HPAScaleBehavior : TeaModel {
        // 扩容高级规则
        [NameInMap("scale_up")]
        [Validation(Required=false)]
        public HPAScaleRule ScaleUp { get; set; }

        // 缩容高级规则
        [NameInMap("scale_down")]
        [Validation(Required=false)]
        public HPAScaleRule ScaleDown { get; set; }

    }

}
