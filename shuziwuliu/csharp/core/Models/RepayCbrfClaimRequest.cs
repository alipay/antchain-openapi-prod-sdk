// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class RepayCbrfClaimRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 申请报案人的名称
        [NameInMap("reporter_name")]
        [Validation(Required=false, MaxLength=200)]
        public string ReporterName { get; set; }

        // 申请报案人的联系方式
        [NameInMap("reporter_phone_num")]
        [Validation(Required=false, MaxLength=20)]
        public string ReporterPhoneNum { get; set; }

        // 理赔时间，yyyy-MM-dd HH:mm:ss
        [NameInMap("claim_time")]
        [Validation(Required=true, MaxLength=50)]
        public string ClaimTime { get; set; }

        // 依据实际情况计算的理赔金额，单位元
        [NameInMap("claim_amount")]
        [Validation(Required=true, MaxLength=20)]
        public string ClaimAmount { get; set; }

        // 部分保司所需关联的投保响应编码
        [NameInMap("insured_receipt_no")]
        [Validation(Required=true, MaxLength=200)]
        public string InsuredReceiptNo { get; set; }

        // PICC-人保
        [NameInMap("insurance_code")]
        [Validation(Required=true, MaxLength=32)]
        public string InsuranceCode { get; set; }

        // 02-跨境退货运费险
        [NameInMap("product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ProductCode { get; set; }

        // 保司出具的保单编号
        [NameInMap("policy_no")]
        [Validation(Required=true, MaxLength=50)]
        public string PolicyNo { get; set; }

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

        // 到达国内仓时间 yyyy-MM-dd HH:mm:ss
        [NameInMap("dwa_time")]
        [Validation(Required=false, MaxLength=50)]
        public string DwaTime { get; set; }

        // 2位ISO缩写
        [NameInMap("dest_country")]
        [Validation(Required=true, MaxLength=32)]
        public string DestCountry { get; set; }

        // 索赔材料信息
        // 数组内最多10项，url长度限制最大500，name长度限制最大200
        [NameInMap("claim_informations")]
        [Validation(Required=false)]
        public List<ClaimInformation> ClaimInformations { get; set; }

    }

}
