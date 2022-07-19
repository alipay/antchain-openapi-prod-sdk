// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 用于MyPocket返回链上账户
    public class AccountEntry : TeaModel {
        // mychain的账户名字
        [NameInMap("account_name")]
        [Validation(Required=true)]
        public string AccountName { get; set; }

        // account_name的hash的hex string
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

    }

}
