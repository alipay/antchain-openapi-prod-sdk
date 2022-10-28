// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商家信息
    public class ServiceProvider : TeaModel {
        // 账户ID
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

        // 商家名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

    }

}
