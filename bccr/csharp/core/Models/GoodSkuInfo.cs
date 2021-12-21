// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 商品sku信息
    public class GoodSkuInfo : TeaModel {
        // 授权规格序号
        [NameInMap("sku_num")]
        [Validation(Required=true)]
        public string SkuNum { get; set; }

        // 授权规格价格(单位：分)
        [NameInMap("price")]
        [Validation(Required=true)]
        public long? Price { get; set; }

    }

}
