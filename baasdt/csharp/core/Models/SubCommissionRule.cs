// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 手续费子结构体
    public class SubCommissionRule : TeaModel {
        // deduct_token
        [NameInMap("deduct_token")]
        [Validation(Required=true)]
        public string DeductToken { get; set; }

        // deduct_ratio
        [NameInMap("deduct_ratio")]
        [Validation(Required=true)]
        public string DeductRatio { get; set; }

        // account_id
        [NameInMap("account_id")]
        [Validation(Required=true)]
        public string AccountId { get; set; }

    }

}
