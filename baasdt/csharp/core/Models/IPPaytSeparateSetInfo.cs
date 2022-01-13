// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 按件付费单独设置的品类和保底量信息
    public class IPPaytSeparateSetInfo : TeaModel {
        // 授权品类
        [NameInMap("category")]
        [Validation(Required=false)]
        public string Category { get; set; }

        // 单件单价
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

        // 保底商品数量
        [NameInMap("guarantee_goods_number")]
        [Validation(Required=false)]
        public string GuaranteeGoodsNumber { get; set; }

    }

}
