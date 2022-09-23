// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 调解回款银行账户
    public class BankAccountInfo : TeaModel {
        // 开户名称
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // 开户行
        [NameInMap("account_bank")]
        [Validation(Required=true)]
        public string AccountBank { get; set; }

        // 开户账号
        [NameInMap("account_number")]
        [Validation(Required=true)]
        public string AccountNumber { get; set; }

        // 联系电话
        [NameInMap("account_phone")]
        [Validation(Required=true)]
        public string AccountPhone { get; set; }

    }

}
