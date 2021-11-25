// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 保证金对象
    public class SecurityFundDto : TeaModel {
        // 保证金类型
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 金额
        [NameInMap("amount")]
        [Validation(Required=true)]
        public string Amount { get; set; }

    }

}
