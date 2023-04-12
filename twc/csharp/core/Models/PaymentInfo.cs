// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 缴费账户信息
    public class PaymentInfo : TeaModel {
        // 收款账户-户名 不超过64字符
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 收款账户-开户银行 不超过64字符
        [NameInMap("bank_name")]
        [Validation(Required=true)]
        public string BankName { get; set; }

        // 收款账户-收款账户银行账号 不超过64字符
        [NameInMap("bank_num")]
        [Validation(Required=true)]
        public string BankNum { get; set; }

    }

}
