// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // token信息
    public class TokenData : TeaModel {
        // 拥有的token数量
        [NameInMap("token_number")]
        [Validation(Required=true)]
        public long? TokenNumber { get; set; }

        // 来源为debit的token数量
        [NameInMap("debit_token")]
        [Validation(Required=true)]
        public long? DebitToken { get; set; }

        // 来源为debit的token数量
        [NameInMap("credit_token")]
        [Validation(Required=true)]
        public long? CreditToken { get; set; }

        // token发行者account
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

    }

}
