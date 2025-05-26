// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 版权商品库存
    public class ItemInventoryVO : TeaModel {
        // 库存数量
        [NameInMap("stock")]
        [Validation(Required=true)]
        public long? Stock { get; set; }

        // 生效时间
        [NameInMap("gmt_valid")]
        [Validation(Required=true)]
        public string GmtValid { get; set; }

        // 失效时间
        [NameInMap("gmt_invalid")]
        [Validation(Required=true)]
        public string GmtInvalid { get; set; }

    }

}
