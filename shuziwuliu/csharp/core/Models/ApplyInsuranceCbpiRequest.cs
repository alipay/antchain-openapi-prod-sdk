// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceCbpiRequest : TeaModel {
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

        // 保司编码.，PAIC---平安，PICC-人保，CPIC--太保，PICC_SHENZHEN--人保深圳，CPIC_SUZHOU--太保苏州
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalChannelCode { get; set; }

        // 险种编码，06--跨境邮包险，07--平台责任险
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalProductCode { get; set; }

        // 保险协议中的投保人全称
        [NameInMap("tbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string TbrName { get; set; }

        // 投保人证件类型，03--营业执照
        // 
        [NameInMap("tbr_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string TbrIdType { get; set; }

        // 投保人证件号码
        [NameInMap("tbr_id_no")]
        [Validation(Required=true, MaxLength=30)]
        public string TbrIdNo { get; set; }

        // 被保人姓名，实际的保险被保人名称
        [NameInMap("bbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string BbrName { get; set; }

        // 被保人证件类型，01--居民身份证、03--营业执照
        [NameInMap("bbr_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string BbrIdType { get; set; }

        // 被保人证件号码
        // 
        [NameInMap("bbr_id_no")]
        [Validation(Required=true, MaxLength=30)]
        public string BbrIdNo { get; set; }

        // 受益人名称，实际的保险受益人名称
        // 
        [NameInMap("beneficiary_name")]
        [Validation(Required=true, MaxLength=100)]
        public string BeneficiaryName { get; set; }

        // 受益人证件类型，01--居民身份证、03--营业执照
        [NameInMap("beneficiary_id_type")]
        [Validation(Required=true, MaxLength=2)]
        public string BeneficiaryIdType { get; set; }

        // 受益人证件号码
        [NameInMap("beneficiary_no")]
        [Validation(Required=true, MaxLength=30)]
        public string BeneficiaryNo { get; set; }

        // 保险起期，日期格式yyyy-MM-dd HH:mm:ss
        // 
        [NameInMap("insure_start")]
        [Validation(Required=true)]
        public string InsureStart { get; set; }

        // 保险金额，单位（元），最多支持2位小数，超过2位拒绝；
        // 
        [NameInMap("insured_amount")]
        [Validation(Required=true)]
        public string InsuredAmount { get; set; }

        // 方案名，XBDP—跨境邮包险
        [NameInMap("scheme_name")]
        [Validation(Required=true, MaxLength=100)]
        public string SchemeName { get; set; }

        // 项目名称，命名规范“方案种类+物流业务种类+国别”
        [NameInMap("project_name")]
        [Validation(Required=true, MaxLength=500)]
        public string ProjectName { get; set; }

        // 订单号,物流平台用以区分业务的唯一码
        [NameInMap("related_order_no")]
        [Validation(Required=true, MaxLength=100)]
        public string RelatedOrderNo { get; set; }

        // 寄件时间，日期格式yyyy-MM-dd HH:mm:ss
        [NameInMap("pick_up_time")]
        [Validation(Required=true)]
        public string PickUpTime { get; set; }

        // 快递公司名称，实际的派送公司全称
        [NameInMap("courier_company")]
        [Validation(Required=true, MaxLength=200)]
        public string CourierCompany { get; set; }

        // 快递单号，实际的派送快递单号
        // 
        [NameInMap("courier_number")]
        [Validation(Required=true, MaxLength=100)]
        public string CourierNumber { get; set; }

        // 货物类型,货物类型的大类,支持多组值的传入，英文逗号分割，格式：Computer & Office,Computer & Office,Computer & Office
        [NameInMap("cargo_type")]
        [Validation(Required=true, MaxLength=256)]
        public string CargoType { get; set; }

        // 货物名称,实际的货物名称,支持多组值的传入，英文逗号分割，格式：3D Printing,3D Printing,3D Printing
        [NameInMap("cargo_name")]
        [Validation(Required=true, MaxLength=256)]
        public string CargoName { get; set; }

        // 货物数量,支持多组值的传入，英文逗号分割，格式：1,1,1
        [NameInMap("cargo_quantity")]
        [Validation(Required=true, MaxLength=256)]
        public string CargoQuantity { get; set; }

        // 货物重量，支持多组值的传入，英文逗号分割，格式：1,2,3
        [NameInMap("cargo_weight")]
        [Validation(Required=false, MaxLength=256)]
        public string CargoWeight { get; set; }

        // 买家ID,买家的脱敏唯一标识
        [NameInMap("buy_id")]
        [Validation(Required=true, MaxLength=100)]
        public string BuyId { get; set; }

        // 卖家ID,卖家的脱敏唯一标识
        [NameInMap("sell_id")]
        [Validation(Required=true, MaxLength=100)]
        public string SellId { get; set; }

        // 出发地地址,包裹的实际发件地地址
        [NameInMap("start_place")]
        [Validation(Required=true, MaxLength=500)]
        public string StartPlace { get; set; }

        // 目的地地址,包裹的实际收件地地址
        [NameInMap("destination")]
        [Validation(Required=true, MaxLength=500)]
        public string Destination { get; set; }

        // ISO到达国别,包裹业务实际发生的国家
        [NameInMap("iso_country")]
        [Validation(Required=true, MaxLength=10)]
        public string IsoCountry { get; set; }

        // 货物申报总价值，单位（元），最多支持2位小数，超过2位拒绝
        [NameInMap("cargo_worth")]
        [Validation(Required=true)]
        public string CargoWorth { get; set; }

        // 收货人名称
        [NameInMap("consignee_name")]
        [Validation(Required=false, MaxLength=100)]
        public string ConsigneeName { get; set; }

        // 平安询价code,当客户向平安进行保险投递时，请填写上平安询价code字段
        [NameInMap("quote_mark")]
        [Validation(Required=false, MaxLength=100)]
        public string QuoteMark { get; set; }

    }

}
