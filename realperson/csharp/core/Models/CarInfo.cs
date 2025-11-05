// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.REALPERSON.Models
{
    // 车辆资产验证旗舰版车辆信息
    public class CarInfo : TeaModel {
        // 是否高频使用，格式：YES/NO
        [NameInMap("high_frequency")]
        [Validation(Required=false)]
        public string HighFrequency { get; set; }

        // 车辆价值区间，格式：1，2，3...
        [NameInMap("value")]
        [Validation(Required=false)]
        public string Value { get; set; }

        // 车辆类型，格式：1，2，3
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
