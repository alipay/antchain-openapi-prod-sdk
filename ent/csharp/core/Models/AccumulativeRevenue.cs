// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 累计全部参与收益
    public class AccumulativeRevenue : TeaModel {
        // 币种，当前仅支持 CNY
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 金额，单位为分
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

    }

}
