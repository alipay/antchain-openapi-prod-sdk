// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_2abe765c32934341bd9bb6cc1c8ff589.Models
{
    // 订单包含的单个商品模型
    public class OrderGoodsModel : TeaModel {
        // 商品 id
        [NameInMap("product_id")]
        [Validation(Required=true, MaxLength=50)]
        public string ProductId { get; set; }

        // 商品版本，每个商品的编码+版本 唯一确认一个产品信息，必须为自然数，如"0","1","10"等
        [NameInMap("product_version")]
        [Validation(Required=true)]
        public long? ProductVersion { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=true, MaxLength=50)]
        public string ProductName { get; set; }

        // 商品价格,精确到分，即 1234 表示 12.34 元
        [NameInMap("product_price")]
        [Validation(Required=true)]
        public long? ProductPrice { get; set; }

        // 商品(3C产品)的设备 id
        [NameInMap("product_imei_id")]
        [Validation(Required=true, MaxLength=200)]
        public string ProductImeiId { get; set; }

        // 链上采购供应商租户 id，提供商品方的金融科技租户 id，否则平台自己名称
        [NameInMap("supplier_id")]
        [Validation(Required=true, MaxLength=50)]
        public string SupplierId { get; set; }

        // 商品数量，不能为空，且大于 0
        [NameInMap("product_number")]
        [Validation(Required=true)]
        public long? ProductNumber { get; set; }

    }

}
