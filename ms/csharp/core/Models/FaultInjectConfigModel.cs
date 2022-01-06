// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MS.Models
{
    // 故障注入配置信息
    public class FaultInjectConfigModel : TeaModel {
        // 故障百分比
        [NameInMap("fault_percent")]
        [Validation(Required=false)]
        public string FaultPercent { get; set; }

        // 故障错误码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 故障延迟时间（ms）
        [NameInMap("fixed_delay")]
        [Validation(Required=false)]
        public string FixedDelay { get; set; }

    }

}
