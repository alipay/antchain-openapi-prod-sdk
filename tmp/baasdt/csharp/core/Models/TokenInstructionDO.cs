// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 交易token来源信息
    public class TokenInstructionDO : TeaModel {
        // token类型
        [NameInMap("token_type")]
        [Validation(Required=true)]
        public long? TokenType { get; set; }

        // token价格
        [NameInMap("token_price")]
        [Validation(Required=true)]
        public string TokenPrice { get; set; }

        // token来源账户ID
        [NameInMap("pay_account_id")]
        [Validation(Required=true)]
        public string PayAccountId { get; set; }

    }

}
