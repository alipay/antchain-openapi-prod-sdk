// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceOspireportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方生成的唯一编码，格式为 yyyyMMdd_身份标识_其他编码，系统会根据该流水号做防重、幂等判断逻辑。
        // yyyyMMdd请传递当前时间。 
        // 身份标识可自定义。
        // 其他编码建议为随机值。
        // 当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；	
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 保司编码，PAIC---平安，CICP-中华财险，CPIC--太保，PICC_SHENZHEN--人保深圳，CPIC_SUZHOU--太保苏州
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalChannelCode { get; set; }

        // 险种编码
        // 04--海外邮包险
        // 06--跨境邮包险
        // 07--平台责任险
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalProductCode { get; set; }

        // 保单号，申请理赔的保单号
        [NameInMap("policy_no")]
        [Validation(Required=true, MaxLength=200)]
        public string PolicyNo { get; set; }

        // 订单号，申请理赔所关联的订单号
        [NameInMap("rela_order_no")]
        [Validation(Required=true, MaxLength=200)]
        public string RelaOrderNo { get; set; }

        // 出险时间，发生损失的时间，yyyy-MM-dd HH:mm:ss
        [NameInMap("accident_time")]
        [Validation(Required=true)]
        public string AccidentTime { get; set; }

        // 报案人名称，申请报案人的名称
        [NameInMap("reporter_name")]
        [Validation(Required=true, MaxLength=100)]
        public string ReporterName { get; set; }

        // 报案人联系方式，申请报案人的联系方式
        [NameInMap("reporter_contact")]
        [Validation(Required=true, MaxLength=20)]
        public string ReporterContact { get; set; }

        // 索赔金额，单位（元），最多支持2位小数，超2位小数拒绝
        [NameInMap("claim_amount")]
        [Validation(Required=true)]
        public string ClaimAmount { get; set; }

        // 物流揽收时间，yyyy-MM-dd HH:mm:ss。平台责任险可不填
        [NameInMap("collect_date")]
        [Validation(Required=false)]
        public string CollectDate { get; set; }

        // 工单号，平台客服判责的工单号。
        [NameInMap("job_no")]
        [Validation(Required=true, MaxLength=100)]
        public string JobNo { get; set; }

        // 快递公司名称，实际的派送公司全称。平台责任险可不填
        [NameInMap("courier_company")]
        [Validation(Required=false, MaxLength=200)]
        public string CourierCompany { get; set; }

        // 快递单号，实际的派送快递单号。平台责任险可不填
        [NameInMap("courier_number")]
        [Validation(Required=false, MaxLength=100)]
        public string CourierNumber { get; set; }

        // 买家ID，买家的脱敏唯一标识
        [NameInMap("buy_id")]
        [Validation(Required=true, MaxLength=100)]
        public string BuyId { get; set; }

        // 卖家ID，卖家的脱敏唯一标识 
        [NameInMap("sell_id")]
        [Validation(Required=true, MaxLength=100)]
        public string SellId { get; set; }

        // 站点/仓储ID，站点/仓储的脱敏唯一标识
        [NameInMap("site_id")]
        [Validation(Required=false, MaxLength=100)]
        public string SiteId { get; set; }

        // 货物名称，实际的货物名称,支持多组传递，逗号分隔，格式：xiaomi14pro 12G+256G,xiaomi15 12G+256G,xiaomi14 12G+256G
        [NameInMap("cargo_name")]
        [Validation(Required=true, MaxLength=256)]
        public string CargoName { get; set; }

        // 货物的重量，单位(kg)，最多支持6位小数。平台责任险可不填
        [NameInMap("cargo_weight")]
        [Validation(Required=false, MaxLength=256)]
        public string CargoWeight { get; set; }

        // 货物类型，支持多组传递，逗号分隔，格式：Electronic 3C Digital,Electronic 3C Digital,Electronic 3C Digital
        [NameInMap("cargo_type")]
        [Validation(Required=false, MaxLength=256)]
        public string CargoType { get; set; }

        // 货物数量，支持多组传递，逗号分割，格式：1,1,1
        [NameInMap("cargo_quantity")]
        [Validation(Required=false, MaxLength=256)]
        public string CargoQuantity { get; set; }

        // 货物重量，支持多组传递，逗号分隔，格式：3800,5400,3200
        [NameInMap("cargo_amount")]
        [Validation(Required=false, MaxLength=256)]
        public string CargoAmount { get; set; }

        // 出发地地址，货物的出发地地址
        [NameInMap("start_place")]
        [Validation(Required=true, MaxLength=500)]
        public string StartPlace { get; set; }

        // 目的地地址，货物的目的地地址
        [NameInMap("destination")]
        [Validation(Required=true, MaxLength=500)]
        public string Destination { get; set; }

        // ISO到达国别，包裹业务实际发生的国家
        [NameInMap("iso_country")]
        [Validation(Required=true, MaxLength=10)]
        public string IsoCountry { get; set; }

        // 出险地址，货物发生实际损失的最近的一次地址记录。平台责任险选填
        [NameInMap("accident_address")]
        [Validation(Required=false, MaxLength=500)]
        public string AccidentAddress { get; set; }

        // 平台赔款支付时间，平台先行赔付的时间，yyyy-MM-dd HH:mm:ss
        [NameInMap("payment_time")]
        [Validation(Required=true)]
        public string PaymentTime { get; set; }

        // 赔付项目类型，01-运费，02-货值，03-货值2
        [NameInMap("payment_item")]
        [Validation(Required=true, MaxLength=2)]
        public string PaymentItem { get; set; }

        // 出险类型，赔付的出险类型，届时保司和平台方商定
        [NameInMap("accident_type")]
        [Validation(Required=true, MaxLength=20)]
        public string AccidentType { get; set; }

        // 索赔资料附件，最多10个。平台责任险可不填
        [NameInMap("claim_informations")]
        [Validation(Required=false)]
        public List<ClaimInformation> ClaimInformations { get; set; }

        // 客户或物流CP商，针对此票货物的出发仓ID
        [NameInMap("despatch_warehouse_id")]
        [Validation(Required=false, MaxLength=100)]
        public string DespatchWarehouseId { get; set; }

        // 平台赔款支付信息。平台责任险需填
        [NameInMap("reparations_info")]
        [Validation(Required=false)]
        public ReparationsInfo ReparationsInfo { get; set; }

    }

}
