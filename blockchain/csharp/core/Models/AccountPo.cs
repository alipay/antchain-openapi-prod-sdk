// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // AccountPo
    public class AccountPo : TeaModel {
        // 账户 hash
        [NameInMap("account")]
        [Validation(Required=false)]
        public string Account { get; set; }

        // 账户创建时间
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public long? CreateTime { get; set; }

        // 创建该账户的交易hash
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 创建该账户的 账户hash
        [NameInMap("parent")]
        [Validation(Required=false)]
        public string Parent { get; set; }

    }

}
