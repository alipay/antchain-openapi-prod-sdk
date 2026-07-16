// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class DetailInnerPlatformproductResponse : TeaModel {
        // 请求唯一ID，用于链路跟踪和问题排查
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        // 结果码，一般OK表示调用成功
        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        // 异常信息的文本描述
        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 平台商品ID
        [NameInMap("platform_product_id")]
        [Validation(Required=false)]
        public string PlatformProductId { get; set; }

        // 商户商品ID
        [NameInMap("merchant_product_id")]
        [Validation(Required=false)]
        public string MerchantProductId { get; set; }

        // 一级分类
        [NameInMap("primary_category")]
        [Validation(Required=false)]
        public string PrimaryCategory { get; set; }

        // 二级分类
        [NameInMap("secondary_category")]
        [Validation(Required=false)]
        public string SecondaryCategory { get; set; }

        // 商品名称
        [NameInMap("product_name")]
        [Validation(Required=false)]
        public string ProductName { get; set; }

        // 商品成色
        [NameInMap("product_condition")]
        [Validation(Required=false)]
        public string ProductCondition { get; set; }

        // 商品描述
        [NameInMap("product_description")]
        [Validation(Required=false)]
        public string ProductDescription { get; set; }

        // 商品封面图
        [NameInMap("cover_image_url_list")]
        [Validation(Required=false)]
        public List<string> CoverImageUrlList { get; set; }

        // 商品封面图-完整链接
        [NameInMap("large_cover_image_url_list")]
        [Validation(Required=false)]
        public List<string> LargeCoverImageUrlList { get; set; }

        // 商品详情图
        [NameInMap("detail_image_url_list")]
        [Validation(Required=false)]
        public List<string> DetailImageUrlList { get; set; }

        // 商品详情图-完整链接
        [NameInMap("large_detail_image_url_list")]
        [Validation(Required=false)]
        public List<string> LargeDetailImageUrlList { get; set; }

        // 商品规格
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

        // 平台配置的字段key列表（仅包含租赁销售属性/其他属性中的字段
        [NameInMap("platform_config_param_list")]
        [Validation(Required=false)]
        public List<string> PlatformConfigParamList { get; set; }

        // 允许的租户列表
        [NameInMap("allow_apply_tenant_id_list")]
        [Validation(Required=false)]
        public List<string> AllowApplyTenantIdList { get; set; }

        // 提报状态
        [NameInMap("apply_status")]
        [Validation(Required=false)]
        public string ApplyStatus { get; set; }

        // 审核理由
        [NameInMap("refuse_reason")]
        [Validation(Required=false)]
        public string RefuseReason { get; set; }

        // 租赁方案说明
        [NameInMap("rental_plan_intro")]
        [Validation(Required=false)]
        public string RentalPlanIntro { get; set; }

    }

}
