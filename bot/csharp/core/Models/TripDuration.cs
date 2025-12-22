// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    // iotx时间
    public class TripDuration : TeaModel {
        // 时间
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // 时间单位
        [NameInMap("unit")]
        [Validation(Required=true)]
        public string Unit { get; set; }

    }

}
