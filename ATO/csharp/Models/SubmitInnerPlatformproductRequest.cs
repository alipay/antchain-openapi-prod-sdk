// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class SubmitInnerPlatformproductRequest : TeaModel {
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

        // 操作类型：edit/submit
        [NameInMap("operate_type")]
        [Validation(Required=false)]
        public string OperateType { get; set; }

        // 平台商品Id
        [NameInMap("platform_product_id")]
        [Validation(Required=false)]
        public string PlatformProductId { get; set; }

        // 商户商品spuId
        [NameInMap("merchant_product_id")]
        [Validation(Required=false)]
        public string MerchantProductId { get; set; }

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

        // 租赁价格方案列表
        [NameInMap("lease_price_plan_list")]
        [Validation(Required=false)]
        public List<LeasePricePlan> LeasePricePlanList { get; set; }

        // 寄出是否包邮
        [NameInMap("free_shipping_out")]
        [Validation(Required=false)]
        public bool? FreeShippingOut { get; set; }

        // 寄回是否包邮
        [NameInMap("free_shipping_back")]
        [Validation(Required=false)]
        public bool? FreeShippingBack { get; set; }

        // 发货时效
        [NameInMap("shipping_duration_type")]
        [Validation(Required=false)]
        public string ShippingDurationType { get; set; }

        // 增值服务介绍
        [NameInMap("value_added_service_intro")]
        [Validation(Required=false)]
        public string ValueAddedServiceIntro { get; set; }

        // 详情页介绍
        [NameInMap("detail_page_intro")]
        [Validation(Required=false)]
        public string DetailPageIntro { get; set; }

        // 服务承诺
        [NameInMap("service_promise_intro")]
        [Validation(Required=false)]
        public List<string> ServicePromiseIntro { get; set; }

        // 租赁方案说明
        [NameInMap("rental_plan_intro")]
        [Validation(Required=false)]
        public string RentalPlanIntro { get; set; }

    }

}
