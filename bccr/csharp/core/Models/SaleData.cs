// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 在售商品的信息
    public class SaleData : TeaModel {
        // 摘要数据
        [NameInMap("sale_digiest_data")]
        [Validation(Required=true)]
        public SaleDigestData SaleDigiestData { get; set; }

    }

}
