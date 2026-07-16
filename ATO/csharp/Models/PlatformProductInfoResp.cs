// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 随时享-平台商品信息
    public class PlatformProductInfoResp : TeaModel {
        // 申请单状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>APPROVED</para>
        /// </summary>
        [NameInMap("apply_status")]
        [Validation(Required=false)]
        public string ApplyStatus { get; set; }

        // 审核原因
        /// <summary>
        /// <b>Example:</b>
        /// <para>审核原因</para>
        /// </summary>
        [NameInMap("refuse_reason")]
        [Validation(Required=false)]
        public string RefuseReason { get; set; }

        // 平台商品id
        /// <summary>
        /// <b>Example:</b>
        /// <para>20240505151148001384</para>
        /// </summary>
        [NameInMap("platform_product_id")]
        [Validation(Required=false)]
        public string PlatformProductId { get; set; }

        // 商家商品id
        /// <summary>
        /// <b>Example:</b>
        /// <para>20240505151148001384</para>
        /// </summary>
        [NameInMap("merchant_product_id")]
        [Validation(Required=false)]
        public string MerchantProductId { get; set; }

        // 商品名称
        /// <summary>
        /// <b>Example:</b>
        /// <para>商品名称</para>
        /// </summary>
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 封面首图url链接
        /// <summary>
        /// <b>Example:</b>
        /// <para>/mer/key</para>
        /// </summary>
        [NameInMap("first_cover_image_url")]
        [Validation(Required=false)]
        public string FirstCoverImageUrl { get; set; }

        // 封面首图url链接
        /// <summary>
        /// <b>Example:</b>
        /// <para><a href="http://merchant/key">http://merchant/key</a></para>
        /// </summary>
        [NameInMap("large_first_cover_image_url")]
        [Validation(Required=false)]
        public string LargeFirstCoverImageUrl { get; set; }

        // 商品上架状态
        /// <summary>
        /// <b>Example:</b>
        /// <para>ONLINE</para>
        /// </summary>
        [NameInMap("display_status")]
        [Validation(Required=false)]
        public string DisplayStatus { get; set; }

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
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("support_renew")]
        [Validation(Required=false)]
        public bool? SupportRenew { get; set; }

        // 可买断
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("support_buyout")]
        [Validation(Required=false)]
        public bool? SupportBuyout { get; set; }

        // 最低日租金(单位分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("lowest_daily_rent_money")]
        [Validation(Required=false)]
        public long? LowestDailyRentMoney { get; set; }

        // 最低日租金(单位元)
        /// <summary>
        /// <b>Example:</b>
        /// <para>2</para>
        /// </summary>
        [NameInMap("lowest_daily_rent_money_yuan")]
        [Validation(Required=false)]
        public string LowestDailyRentMoneyYuan { get; set; }

        // 最高日租金(单位分)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("highest_daily_rent_money")]
        [Validation(Required=false)]
        public long? HighestDailyRentMoney { get; set; }

        // 最高日租金(单位元)
        /// <summary>
        /// <b>Example:</b>
        /// <para>1</para>
        /// </summary>
        [NameInMap("highest_daily_rent_money_yuan")]
        [Validation(Required=false)]
        public string HighestDailyRentMoneyYuan { get; set; }

    }

}
