// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 商品信息
    public class ProductInfo : TeaModel {
        // 商家社会统一信用代码
        [NameInMap("merchant_id")]
        [Validation(Required=false)]
        public string MerchantId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品id
        [NameInMap("product_id")]
        [Validation(Required=false)]
        public string ProductId { get; set; }

        // 商品规格
        [NameInMap("product_model")]
        [Validation(Required=false)]
        public string ProductModel { get; set; }

        // 商品版本
        [NameInMap("product_version")]
        [Validation(Required=false)]
        public string ProductVersion { get; set; }

        // 指导价(单位分)
        [NameInMap("product_price")]
        [Validation(Required=false)]
        public long? ProductPrice { get; set; }

        // 一级类目
        [NameInMap("main_class")]
        [Validation(Required=false)]
        public string MainClass { get; set; }

        // 二级类目
        [NameInMap("sub_class")]
        [Validation(Required=false)]
        public string SubClass { get; set; }

        // 品牌
        [NameInMap("product_brand")]
        [Validation(Required=false)]
        public string ProductBrand { get; set; }

    }

}
