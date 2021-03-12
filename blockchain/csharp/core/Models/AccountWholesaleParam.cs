// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 数字资产管理平台批发结构
    public class AccountWholesaleParam : TeaModel {
        // 批发数量
        [NameInMap("ep_amount")]
        [Validation(Required=true)]
        public long? EpAmount { get; set; }

        // 用户账户
        [NameInMap("user_account")]
        [Validation(Required=true)]
        public string UserAccount { get; set; }

    }

}
