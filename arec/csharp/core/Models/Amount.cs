// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AREC.Models
{
    // 金额信息
    public class Amount : TeaModel {
        // 币种代码，如CNY代表人民币
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 币种金额，如200.00，人民币以元为单位，保留两位小数
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

    }

}
