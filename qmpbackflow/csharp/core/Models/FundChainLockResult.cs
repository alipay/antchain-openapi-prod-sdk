// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 商户资金链锁定结果
    public class FundChainLockResult : TeaModel {
        // 店铺名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 店铺id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 0:成功
        // 1:失败
        // 2:处理中
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

    }

}
