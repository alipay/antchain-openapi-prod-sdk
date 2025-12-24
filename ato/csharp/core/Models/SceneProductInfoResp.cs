// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 随时享-服务商平台场景商品列表resp
    public class SceneProductInfoResp : TeaModel {
        // 平台商品id
        [NameInMap("platform_product_id")]
        [Validation(Required=false)]
        public string PlatformProductId { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 封面首图url链接
        [NameInMap("first_cover_image_url")]
        [Validation(Required=false)]
        public string FirstCoverImageUrl { get; set; }

        // 封面首图url链接
        [NameInMap("large_first_cover_image_url")]
        [Validation(Required=false)]
        public string LargeFirstCoverImageUrl { get; set; }

        // 产品规格列表
        [NameInMap("spec_config_list")]
        [Validation(Required=false)]
        public List<ProductSpecConfig> SpecConfigList { get; set; }

        // 租赁方案
        [NameInMap("rental_plan")]
        [Validation(Required=false)]
        public List<string> RentalPlan { get; set; }

        // 租赁周期
        [NameInMap("rental_period")]
        [Validation(Required=false)]
        public List<long?> RentalPeriod { get; set; }

        // 可续租
        [NameInMap("support_renew")]
        [Validation(Required=false)]
        public bool? SupportRenew { get; set; }

        // 可买断
        [NameInMap("support_buyout")]
        [Validation(Required=false)]
        public bool? SupportBuyout { get; set; }

        // 最低日租金
        [NameInMap("lowest_daily_rent_money")]
        [Validation(Required=false)]
        public long? LowestDailyRentMoney { get; set; }

        // 最低日租金
        [NameInMap("lowest_daily_rent_money_yuan")]
        [Validation(Required=false)]
        public string LowestDailyRentMoneyYuan { get; set; }

        // 最高日租金
        [NameInMap("highest_daily_rent_money")]
        [Validation(Required=false)]
        public long? HighestDailyRentMoney { get; set; }

        // 最高日租金
        [NameInMap("highest_daily_rent_money_yuan")]
        [Validation(Required=false)]
        public string HighestDailyRentMoneyYuan { get; set; }

        // 添加标志
        [NameInMap("added_flag")]
        [Validation(Required=false)]
        public bool? AddedFlag { get; set; }

        // 报名商家列表
        [NameInMap("sign_product_merchant_list")]
        [Validation(Required=false)]
        public List<SignProductMerchant> SignProductMerchantList { get; set; }

        // 报名商家数量
        [NameInMap("sign_product_merchant_count")]
        [Validation(Required=false)]
        public long? SignProductMerchantCount { get; set; }

        // 适用商家列表
        [NameInMap("apply_product_merchant_list")]
        [Validation(Required=false)]
        public List<SignProductMerchant> ApplyProductMerchantList { get; set; }

        // 适用商家数量
        [NameInMap("apply_product_merchant_count")]
        [Validation(Required=false)]
        public long? ApplyProductMerchantCount { get; set; }

        // 场景商品上下架状态
        [NameInMap("display_status")]
        [Validation(Required=false)]
        public string DisplayStatus { get; set; }

        // 推广方式
        [NameInMap("delivery_mode")]
        [Validation(Required=false)]
        public string DeliveryMode { get; set; }

    }

}
