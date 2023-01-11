// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyCbrfInsureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 保司编码
        [NameInMap("insurance_code")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuranceCode { get; set; }

        // 险种编码
        // 
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ProductCode { get; set; }

        // 保险协议中的投保人全称
        [NameInMap("policyholder_name")]
        [Validation(Required=true, MaxLength=200)]
        public string PolicyholderName { get; set; }

        // 投保人证件类型，01--居民身份证、03--营业执照
        [NameInMap("policyholder_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string PolicyholderIdType { get; set; }

        // 投保人证件号码
        [NameInMap("policyholder_id_no")]
        [Validation(Required=true, MaxLength=50)]
        public string PolicyholderIdNo { get; set; }

        // 被保人姓名，实际的保险被保人名称
        [NameInMap("insured_name")]
        [Validation(Required=true, MaxLength=200)]
        public string InsuredName { get; set; }

        // 被保人证件类型，01--居民身份证、03--营业执照
        [NameInMap("insured_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string InsuredIdType { get; set; }

        // 被保人证件号码
        [NameInMap("insured_id_no")]
        [Validation(Required=true, MaxLength=50)]
        public string InsuredIdNo { get; set; }

        // 受益人名称，实际的保险受益人名称
        [NameInMap("beneficiary_name")]
        [Validation(Required=false, MaxLength=200)]
        public string BeneficiaryName { get; set; }

        // 受益人证件类型，01--居民身份证、03--营业执照
        [NameInMap("beneficiary_id_type")]
        [Validation(Required=false, MaxLength=2)]
        public string BeneficiaryIdType { get; set; }

        // 受益人证件号码
        [NameInMap("beneficiary_id_no")]
        [Validation(Required=false, MaxLength=50)]
        public string BeneficiaryIdNo { get; set; }

        // 保司针对当前的项目所给的方案名
        [NameInMap("scheme_name")]
        [Validation(Required=true, MaxLength=200)]
        public string SchemeName { get; set; }

        // 保司针对当前的项目所给的项目名
        [NameInMap("project_name")]
        [Validation(Required=false, MaxLength=200)]
        public string ProjectName { get; set; }

        // 保险金额，单位（元），最多支持2位小数，超过2位拒绝
        [NameInMap("insurance_amount")]
        [Validation(Required=false, MaxLength=20)]
        public string InsuranceAmount { get; set; }

        // 保险起期,yyyy-MM-dd HH:mm:ss
        [NameInMap("insure_start")]
        [Validation(Required=true, MaxLength=50)]
        public string InsureStart { get; set; }

        // 客户的订单编号
        [NameInMap("related_order_no")]
        [Validation(Required=true, MaxLength=150)]
        public string RelatedOrderNo { get; set; }

        // 此包裹的成交撮合的电商平台名称
        [NameInMap("ecommerce_platform_name")]
        [Validation(Required=true, MaxLength=200)]
        public string EcommercePlatformName { get; set; }

        // 承运此包裹的物流CP商名称
        [NameInMap("logistics_provider")]
        [Validation(Required=true, MaxLength=200)]
        public string LogisticsProvider { get; set; }

        // 货物的揽收时间
        [NameInMap("collection_time")]
        [Validation(Required=false, MaxLength=50)]
        public string CollectionTime { get; set; }

        // yyyy-MM-dd HH:mm:ss 交付航司确认的时间
        [NameInMap("delivery_time")]
        [Validation(Required=true, MaxLength=50)]
        public string DeliveryTime { get; set; }

        // 2位ISO缩写
        [NameInMap("dest_country")]
        [Validation(Required=true, MaxLength=32)]
        public string DestCountry { get; set; }

        // 商家唯一脱敏的编码
        [NameInMap("merchant_id")]
        [Validation(Required=true, MaxLength=200)]
        public string MerchantId { get; set; }

        // 买家唯一脱敏的编码
        [NameInMap("buyer_id")]
        [Validation(Required=true, MaxLength=200)]
        public string BuyerId { get; set; }

        // 货物重量，单位（kg）
        [NameInMap("cargo_weight")]
        [Validation(Required=true, MaxLength=50)]
        public string CargoWeight { get; set; }

        // 货物类型的大类
        [NameInMap("cargo_type")]
        [Validation(Required=true, MaxLength=200)]
        public string CargoType { get; set; }

        // 实际的货物名称
        [NameInMap("cargo_name")]
        [Validation(Required=true, MaxLength=200)]
        public string CargoName { get; set; }

        // 货物的美金商品价值
        [NameInMap("cargo_value")]
        [Validation(Required=true, MaxLength=20)]
        public string CargoValue { get; set; }

    }

}
