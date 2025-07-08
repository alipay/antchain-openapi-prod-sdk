// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 二轮车一体机车辆SKU
    public class SimSkuInfo : TeaModel {
        // sku对外id
        [NameInMap("sku_id")]
        [Validation(Required=true)]
        public string SkuId { get; set; }

        // sku名称
        [NameInMap("sku_name")]
        [Validation(Required=true)]
        public string SkuName { get; set; }

        // sku官方指导价：单位为元
        [NameInMap("price")]
        [Validation(Required=true)]
        public string Price { get; set; }

        // sku门店优惠价：单位为元
        [NameInMap("store_price")]
        [Validation(Required=true)]
        public string StorePrice { get; set; }

        // 车型
        [NameInMap("vehicle_model")]
        [Validation(Required=true)]
        public string VehicleModel { get; set; }

        // 续航里程
        [NameInMap("range_km")]
        [Validation(Required=true)]
        public string RangeKm { get; set; }

        // 关键词，逗号分隔
        [NameInMap("keywords")]
        [Validation(Required=true)]
        public string Keywords { get; set; }

        // 颜色，逗号分隔
        [NameInMap("colors")]
        [Validation(Required=true)]
        public string Colors { get; set; }

        // 配件信息，逗号分隔
        [NameInMap("accessories")]
        [Validation(Required=true)]
        public string Accessories { get; set; }

        // 图片url json
        [NameInMap("images")]
        [Validation(Required=true)]
        public string Images { get; set; }

        // 门店id
        [NameInMap("store_id")]
        [Validation(Required=true)]
        public string StoreId { get; set; }

        // 车型描述
        [NameInMap("sku_description")]
        [Validation(Required=false)]
        public string SkuDescription { get; set; }

    }

}
