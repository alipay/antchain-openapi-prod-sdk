// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商户备付金账户
    public class Provision : TeaModel {
        // 授信上限
        [NameInMap("credit_max")]
        [Validation(Required=true)]
        public string CreditMax { get; set; }

        // 授信已使用
        [NameInMap("credit_used")]
        [Validation(Required=true)]
        public string CreditUsed { get; set; }

        // 币种
        [NameInMap("currency")]
        [Validation(Required=true)]
        public string Currency { get; set; }

        // 余额
        [NameInMap("debit")]
        [Validation(Required=true)]
        public string Debit { get; set; }

    }

}
