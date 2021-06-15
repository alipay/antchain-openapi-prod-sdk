// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 订单商品信息
    public class OrderItem : TeaModel {
        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 商品品牌
        [NameInMap("commodity_brand")]
        [Validation(Required=true)]
        public string CommodityBrand { get; set; }

        // 商品版本
        [NameInMap("commodity_version")]
        [Validation(Required=true)]
        public string CommodityVersion { get; set; }

        // 商品规格
        [NameInMap("commodity_specification")]
        [Validation(Required=true)]
        public string CommoditySpecification { get; set; }

        // 商品颜色
        [NameInMap("commodity_color")]
        [Validation(Required=false)]
        public string CommodityColor { get; set; }

        // 商品详情
        [NameInMap("commodity_details")]
        [Validation(Required=false)]
        public string CommodityDetails { get; set; }

        // 商品官方价格
        [NameInMap("commodity_official_price")]
        [Validation(Required=true)]
        public string CommodityOfficialPrice { get; set; }

        // 租赁物数量
        [NameInMap("lease_number")]
        [Validation(Required=true)]
        public long? LeaseNumber { get; set; }

    }

}
