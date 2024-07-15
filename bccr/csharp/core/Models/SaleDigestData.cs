// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 在售摘要信息
    public class SaleDigestData : TeaModel {
        // 商品hash值
        [NameInMap("hash")]
        [Validation(Required=true)]
        public string Hash { get; set; }

        // 物料置信度
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

    }

}
