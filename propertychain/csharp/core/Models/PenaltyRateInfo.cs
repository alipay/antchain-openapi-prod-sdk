// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 罚息利率结构体
    public class PenaltyRateInfo : TeaModel {
        // 罚息
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

        // 起始-天
        [NameInMap("start_day")]
        [Validation(Required=true)]
        public long? StartDay { get; set; }

        // 终止-天
        [NameInMap("end_day")]
        [Validation(Required=true)]
        public long? EndDay { get; set; }

    }

}
