// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商品详情
    public class SKUItem : TeaModel {
        // 集分宝销售费率
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

        // 包含集分宝个数
        [NameInMap("sku_amount")]
        [Validation(Required=true)]
        public long? SkuAmount { get; set; }

        // 商品ID
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

        // 商品名称
        [NameInMap("sku_name")]
        [Validation(Required=true)]
        public string SkuName { get; set; }

        // 商品面值（单位：元）
        [NameInMap("sku_price")]
        [Validation(Required=true)]
        public string SkuPrice { get; set; }

        // 商品状态：0可用，1冻结，2下线
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
