// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 账户信息
    public class AccountInfo : TeaModel {
        // 版通数量
        [NameInMap("ep_amount")]
        [Validation(Required=true)]
        public long? EpAmount { get; set; }

        // 版通代码
        [NameInMap("ep_code")]
        [Validation(Required=true)]
        public string EpCode { get; set; }

    }

}
