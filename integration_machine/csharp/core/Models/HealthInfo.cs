// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    // 健康码信息
    public class HealthInfo : TeaModel {
        // 健康码编码：
        // 1:绿色 ，
        // 2:黄色 ，
        // 3:红色 ，
        // 4.灰码 。
        [NameInMap("health_code")]
        [Validation(Required=false)]
        public string HealthCode { get; set; }

        // 健康码红色原因
        [NameInMap("health_factor")]
        [Validation(Required=false)]
        public string HealthFactor { get; set; }

    }

}
