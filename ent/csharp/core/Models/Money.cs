// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ENT.Models
{
    // 金额模型
    public class Money : TeaModel {
        // 金额，单位分
        [NameInMap("value")]
        [Validation(Required=true)]
        public long? Value { get; set; }

        // 币种，暂只支持人民币CNY
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

    }

}
