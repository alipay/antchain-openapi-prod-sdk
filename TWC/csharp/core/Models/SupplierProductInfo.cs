// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 供应商对应的产品详细信息
    public class SupplierProductInfo : TeaModel {
        // 产品额外信息
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

        // 产品id
        [NameInMap("product_id")]
        [Validation(Required=true)]
        public string ProductId { get; set; }

        // 电子商品唯一标识码
        [NameInMap("product_imei_id")]
        [Validation(Required=true)]
        public string ProductImeiId { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true, MaxLength=50)]
        public string ProductName { get; set; }

        // 采购产品的个数
        [NameInMap("product_number")]
        [Validation(Required=true)]
        public long? ProductNumber { get; set; }

        // 采购产品的价格，精确到毫厘，如12.34元表示为123400
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public long? ProductPrice { get; set; }

        // 产品版本
        [NameInMap("supplier_version")]
        [Validation(Required=false)]
        public string SupplierVersion { get; set; }

    }

}
