// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 随时享-服务商平台场景商品租赁配置详情信息
    public class SignMerchantLeaseConfig : TeaModel {
        // 商户商品spuId
        /// <summary>
        /// <b>Example:</b>
        /// <para>s123123123</para>
        /// </summary>
        [NameInMap("merchant_product_id")]
        [Validation(Required=false)]
        public string MerchantProductId { get; set; }

        // 商户品牌
        /// <summary>
        /// <b>Example:</b>
        /// <para>品牌</para>
        /// </summary>
        [NameInMap("merchant_brand")]
        [Validation(Required=false)]
        public string MerchantBrand { get; set; }

        // logo
        /// <summary>
        /// <b>Example:</b>
        /// <para>filekey</para>
        /// </summary>
        [NameInMap("merchant_logo")]
        [Validation(Required=false)]
        public string MerchantLogo { get; set; }

        // logo
        /// <summary>
        /// <b>Example:</b>
        /// <para>http</para>
        /// </summary>
        [NameInMap("large_merchant_logo")]
        [Validation(Required=false)]
        public string LargeMerchantLogo { get; set; }

        // 是否置灰
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("grayed")]
        [Validation(Required=false)]
        public bool? Grayed { get; set; }

        // 租赁方案
        [NameInMap("rental_plan")]
        [Validation(Required=false)]
        public List<string> RentalPlan { get; set; }

        // 租赁方案说明
        /// <summary>
        /// <b>Example:</b>
        /// <para>说明</para>
        /// </summary>
        [NameInMap("rental_plan_intro")]
        [Validation(Required=false)]
        public string RentalPlanIntro { get; set; }

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

        // 租赁价格方案列表
        [NameInMap("lease_price_plan_list")]
        [Validation(Required=false)]
        public List<LeasePricePlan> LeasePricePlanList { get; set; }

        // 寄出是否包邮
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("free_shipping_out")]
        [Validation(Required=false)]
        public bool? FreeShippingOut { get; set; }

        // 寄回是否包邮
        /// <summary>
        /// <b>Example:</b>
        /// <para>true, false</para>
        /// </summary>
        [NameInMap("free_shipping_back")]
        [Validation(Required=false)]
        public bool? FreeShippingBack { get; set; }

        // 发货时效
        /// <summary>
        /// <b>Example:</b>
        /// <para>24</para>
        /// </summary>
        [NameInMap("shipping_duration_type")]
        [Validation(Required=false)]
        public string ShippingDurationType { get; set; }

        // 增值服务介绍
        /// <summary>
        /// <b>Example:</b>
        /// <para>介绍</para>
        /// </summary>
        [NameInMap("value_added_service_intro")]
        [Validation(Required=false)]
        public string ValueAddedServiceIntro { get; set; }

        // 详情页介绍
        /// <summary>
        /// <b>Example:</b>
        /// <para>123</para>
        /// </summary>
        [NameInMap("detail_page_intro")]
        [Validation(Required=false)]
        public string DetailPageIntro { get; set; }

        // 服务承诺
        [NameInMap("service_promise_intro")]
        [Validation(Required=false)]
        public List<string> ServicePromiseIntro { get; set; }

    }

}
