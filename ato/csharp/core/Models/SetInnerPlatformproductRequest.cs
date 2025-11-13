// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SetInnerPlatformproductRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // skuId
        [NameInMap("merchant_sku_id")]
        [Validation(Required=false)]
        public string MerchantSkuId { get; set; }

        // 商品规格列表
        [NameInMap("product_spec_option_list")]
        [Validation(Required=false)]
        public List<ProductSpecOption> ProductSpecOptionList { get; set; }

        // 规格图片
        [NameInMap("spec_image_file_key")]
        [Validation(Required=false)]
        public string SpecImageFileKey { get; set; }

        // 原订单总金额（单位分）
        [NameInMap("origin_total_rent_money")]
        [Validation(Required=false)]
        public long? OriginTotalRentMoney { get; set; }

        // 现订单总金额（单位分）
        [NameInMap("total_rent_money")]
        [Validation(Required=false)]
        public long? TotalRentMoney { get; set; }

        // 原日租金（单位分）
        [NameInMap("origin_daily_rent_money")]
        [Validation(Required=false)]
        public long? OriginDailyRentMoney { get; set; }

        // 现日租金（单位分）
        [NameInMap("daily_rent_money")]
        [Validation(Required=false)]
        public long? DailyRentMoney { get; set; }

        // 库存
        [NameInMap("stock_quantity")]
        [Validation(Required=false)]
        public long? StockQuantity { get; set; }

        // 续租价（单位分）
        [NameInMap("renew_price")]
        [Validation(Required=false)]
        public long? RenewPrice { get; set; }

        // 买断价（单位分）
        [NameInMap("buyout_price")]
        [Validation(Required=false)]
        public long? BuyoutPrice { get; set; }

        // 是否可售卖
        [NameInMap("for_sale")]
        [Validation(Required=false)]
        public bool? ForSale { get; set; }

    }

}
