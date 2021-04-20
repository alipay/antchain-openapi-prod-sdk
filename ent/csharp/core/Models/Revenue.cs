// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 收益模型
    public class Revenue : TeaModel {
        // 收益币种，目前仅支持CNY
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 收益金额，单位为分
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

    }

}
