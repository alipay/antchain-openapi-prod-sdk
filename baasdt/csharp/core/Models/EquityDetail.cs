// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 权益详情
    public class EquityDetail : TeaModel {
        // 权益描述
        [NameInMap("description")]
        [Validation(Required=true)]
        public string Description { get; set; }

        // 权益描述图片OSS地址（分号;分隔）
        [NameInMap("desc_images")]
        [Validation(Required=true)]
        public string DescImages { get; set; }

        // 权益ID
        [NameInMap("equity_id")]
        [Validation(Required=true)]
        public string EquityId { get; set; }

        // 权益名称
        [NameInMap("equity_name")]
        [Validation(Required=true)]
        public string EquityName { get; set; }

        // 权益类型
        [NameInMap("equity_type")]
        [Validation(Required=true)]
        public string EquityType { get; set; }

        // 权益面值(元)
        [NameInMap("equity_value")]
        [Validation(Required=true)]
        public string EquityValue { get; set; }

        // 权益主图片OSS地址（分号;分隔）
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 对客价(元)
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // 权益SKU
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

    }

}
