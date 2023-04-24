// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APPEX.Models
{
    // 链账户
    public class ChainAccountEX : TeaModel {
        // 账户名称
        [NameInMap("account_name")]
        [Validation(Required=false)]
        public string AccountName { get; set; }

        // 账户地址
        [NameInMap("account_address")]
        [Validation(Required=true)]
        public string AccountAddress { get; set; }

        // 账户类型，枚举，MYCHAIN|ETH
        [NameInMap("account_type")]
        [Validation(Required=true)]
        public string AccountType { get; set; }

        // 链ID
        [NameInMap("chain_id")]
        [Validation(Required=true)]
        public string ChainId { get; set; }

    }

}
