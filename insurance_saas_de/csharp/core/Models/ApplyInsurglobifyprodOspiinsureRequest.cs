// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS_DE.Models
{
    public class ApplyInsurglobifyprodOspiinsureRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 调用方生成的唯一编码，系统会根据该流水号做防重、幂等判断逻辑。当极端场景中，系统会返回处理中，错误码为2222，客户端应该保持该流水号不变，并使用原来的请求再次发送请求，系统会根据幂等逻辑返回处理结果；
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 保司编码
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalChannelCode { get; set; }

        // 险种编码
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=10)]
        public string ExternalProductCode { get; set; }

        // 保险方案名
        [NameInMap("ch_scheme_name")]
        [Validation(Required=true, MaxLength=20)]
        public string ChSchemeName { get; set; }

        // 保险项目名
        [NameInMap("ch_project_name")]
        [Validation(Required=true, MaxLength=20)]
        public string ChProjectName { get; set; }

        // 总保额，小数位只支持2位
        [NameInMap("insured_amount")]
        [Validation(Required=true, MaxLength=20)]
        public string InsuredAmount { get; set; }

        // 保费，小数位只支持2位
        [NameInMap("premium")]
        [Validation(Required=true, MaxLength=20)]
        public string Premium { get; set; }

        // 总保费，小数位只支持2位
        [NameInMap("total_premium")]
        [Validation(Required=true, MaxLength=20)]
        public string TotalPremium { get; set; }

        // 币种，使用ISO 4217代码；
        // CNY：人民币
        // USD：美元
        // EUR：欧元
        // GBP：英镑
        // JPY：日元
        // CHF：瑞士法郎
        // SGD：新加坡元
        [NameInMap("currency")]
        [Validation(Required=true, MaxLength=3)]
        public string Currency { get; set; }

        // 关联的大保单编号
        [NameInMap("big_pol_no")]
        [Validation(Required=true, MaxLength=200)]
        public string BigPolNo { get; set; }

        // 保险起期(ISO 8601格式，2026-01-11T14:30:00+02:00)
        [NameInMap("insure_start")]
        [Validation(Required=true, MaxLength=50)]
        public string InsureStart { get; set; }

        // 时区
        // Asia/Shanghai
        // Europe/Berlin
        // America/New_York
        // Pacific/Auckland
        // Europe/Berlin 
        [NameInMap("time_zone")]
        [Validation(Required=true, MaxLength=20)]
        public string TimeZone { get; set; }

        // 投保人名称
        [NameInMap("tbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string TbrName { get; set; }

        // 投保人证件类型
        // // 个人
        // // 护照
        // PASSPORT
        // // 国民身份证
        // NATIONAL_ID
        // // 居留许可
        // RESIDENCE_PERMIT
        // // 个人税号
        // TAX_ID
        // // 企业
        // // 公司注册号（最常用）
        // COMPANY_REGISTRATION
        // // 增值税号
        // VAT_NUMBER
        // // 企业税号
        // TAX_ID
        [NameInMap("tbr_id_type")]
        [Validation(Required=true, MaxLength=20)]
        public string TbrIdType { get; set; }

        // 投保人证件号
        [NameInMap("tbr_id_no")]
        [Validation(Required=true, MaxLength=100)]
        public string TbrIdNo { get; set; }

        // 被保人名称
        [NameInMap("bbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string BbrName { get; set; }

        // 被保人证件类型
        // // 个人
        // // 护照
        // PASSPORT
        // // 国民身份证
        // NATIONAL_ID
        // // 居留许可
        // RESIDENCE_PERMIT
        // // 个人税号
        // TAX_ID
        // // 企业
        // // 公司注册号（最常用）
        // COMPANY_REGISTRATION
        // // 增值税号
        // VAT_NUMBER
        // // 企业税号
        // TAX_ID
        [NameInMap("bbr_id_type")]
        [Validation(Required=true, MaxLength=20)]
        public string BbrIdType { get; set; }

        // 被保人证件号
        [NameInMap("bbr_id_no")]
        [Validation(Required=true, MaxLength=100)]
        public string BbrIdNo { get; set; }

        // 订单号
        [NameInMap("rela_order_no")]
        [Validation(Required=true, MaxLength=100)]
        public string RelaOrderNo { get; set; }

        // 寄件时间(ISO 8601格式，2026-01-11T14:30:00+02:00)
        [NameInMap("pick_up_time")]
        [Validation(Required=true, MaxLength=50)]
        public string PickUpTime { get; set; }

        // 快递公司名称
        [NameInMap("courier_company")]
        [Validation(Required=true, MaxLength=100)]
        public string CourierCompany { get; set; }

        // 快递单号
        [NameInMap("courier_number")]
        [Validation(Required=true, MaxLength=100)]
        public string CourierNumber { get; set; }

        // 货物大类
        [NameInMap("cargo_type")]
        [Validation(Required=true, MaxLength=256)]
        public string CargoType { get; set; }

        // 货物总数量（件）
        [NameInMap("cargo_total_quantity")]
        [Validation(Required=true, MaxLength=100)]
        public string CargoTotalQuantity { get; set; }

        // 货物总重量
        [NameInMap("cargo_total_weight")]
        [Validation(Required=true, MaxLength=200)]
        public string CargoTotalWeight { get; set; }

        // 货物总价值，小数位只支持2位
        [NameInMap("cargo_total_worth")]
        [Validation(Required=true, MaxLength=20)]
        public string CargoTotalWorth { get; set; }

        // 卖家脱敏唯一标识
        [NameInMap("sell_id")]
        [Validation(Required=true, MaxLength=100)]
        public string SellId { get; set; }

        // 卖家NAIC代码
        [NameInMap("sell_naic_code")]
        [Validation(Required=true, MaxLength=50)]
        public string SellNaicCode { get; set; }

        // 出发地ISO国别
        [NameInMap("start_place_iso_country")]
        [Validation(Required=true, MaxLength=10)]
        public string StartPlaceIsoCountry { get; set; }

        // 出发地省市
        [NameInMap("start_place_province_city")]
        [Validation(Required=true, MaxLength=50)]
        public string StartPlaceProvinceCity { get; set; }

        // 出发地详细地址
        [NameInMap("start_place")]
        [Validation(Required=true, MaxLength=500)]
        public string StartPlace { get; set; }

        // 出发地邮编
        [NameInMap("start_place_postcode")]
        [Validation(Required=true, MaxLength=50)]
        public string StartPlacePostcode { get; set; }

        // 买家脱敏唯一标识
        [NameInMap("buy_id")]
        [Validation(Required=true, MaxLength=100)]
        public string BuyId { get; set; }

        // 目的地ISO国别
        [NameInMap("iso_country")]
        [Validation(Required=true, MaxLength=10)]
        public string IsoCountry { get; set; }

        // 湖南省长沙市
        [NameInMap("destination_province_city")]
        [Validation(Required=true, MaxLength=50)]
        public string DestinationProvinceCity { get; set; }

        // 目的地详细地址
        [NameInMap("destination")]
        [Validation(Required=true, MaxLength=500)]
        public string Destination { get; set; }

        // 货物明细
        [NameInMap("cargo_details")]
        [Validation(Required=true)]
        public CargoDetails CargoDetails { get; set; }

    }

}
