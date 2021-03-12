// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 账户映射结果
    public class AccountMappingResult : TeaModel {
        // 该账户在链上的唯一标示
        [NameInMap("baccount")]
        [Validation(Required=true)]
        public string Baccount { get; set; }

        // 当前账户映射结果描述语句
        [NameInMap("message")]
        [Validation(Required=true)]
        public string Message { get; set; }

        // 状态描述符
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 自有系统中该账户唯一标示
        [NameInMap("uid")]
        [Validation(Required=true)]
        public string Uid { get; set; }

    }

}
