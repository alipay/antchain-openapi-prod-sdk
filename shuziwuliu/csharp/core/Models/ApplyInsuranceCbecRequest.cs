// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class ApplyInsuranceCbecRequest : TeaModel {
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

        // 保司编码，CPIC---太保
        [NameInMap("external_channel_code")]
        [Validation(Required=true, MaxLength=64)]
        public string ExternalChannelCode { get; set; }

        // 险种编码，03--跨境出口货运险
        [NameInMap("external_product_code")]
        [Validation(Required=true, MaxLength=2)]
        public string ExternalProductCode { get; set; }

        // 投保人名称
        [NameInMap("tbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string TbrName { get; set; }

        // 投保人证件类型，03--营业执照
        [NameInMap("tbr_id_type")]
        [Validation(Required=false, MaxLength=2)]
        public string TbrIdType { get; set; }

        // 投保人证件号码
        [NameInMap("tbr_id_no")]
        [Validation(Required=false, MaxLength=30)]
        public string TbrIdNo { get; set; }

        // 被保人名称
        [NameInMap("bbr_name")]
        [Validation(Required=true, MaxLength=100)]
        public string BbrName { get; set; }

        // 被保人证件类型，01--居民身份证，03--营业执照
        [NameInMap("bbr_id_type")]
        [Validation(Required=false, MaxLength=2)]
        public string BbrIdType { get; set; }

        // 被保人证件号码
        [NameInMap("bbr_id_no")]
        [Validation(Required=false, MaxLength=30)]
        public string BbrIdNo { get; set; }

        // 出库单号/航次号/运单号
        [NameInMap("related_order_no")]
        [Validation(Required=true, MaxLength=200)]
        public string RelatedOrderNo { get; set; }

        // 包装及数量
        [NameInMap("cargo_quantity")]
        [Validation(Required=true, MaxLength=20)]
        public string CargoQuantity { get; set; }

        // 货物名称
        [NameInMap("cargo_name")]
        [Validation(Required=true, MaxLength=100)]
        public string CargoName { get; set; }

        // 包装代码,参考保司提供样例-包装代码
        [NameInMap("packing_code")]
        [Validation(Required=true, MaxLength=2)]
        public string PackingCode { get; set; }

        // 货物类型代码,参考保司提供样例-货物类型代码
        [NameInMap("cargo_type_code")]
        [Validation(Required=true, MaxLength=4)]
        public string CargoTypeCode { get; set; }

        // 航行区域代码,参考保司提供样例-航行区域代码
        [NameInMap("flight_area_code")]
        [Validation(Required=true, MaxLength=10)]
        public string FlightAreaCode { get; set; }

        // 运输方式代码,参考保司提供样例-运输方式
        [NameInMap("transport_type_code")]
        [Validation(Required=true, MaxLength=2)]
        public string TransportTypeCode { get; set; }

        // 运输工具名称
        [NameInMap("transport_means_name")]
        [Validation(Required=true, MaxLength=30)]
        public string TransportMeansName { get; set; }

        // 航次号
        [NameInMap("voyage")]
        [Validation(Required=false, MaxLength=30)]
        public string Voyage { get; set; }

        // 出发地
        [NameInMap("start_place")]
        [Validation(Required=true, MaxLength=200)]
        public string StartPlace { get; set; }

        // 中转地
        [NameInMap("transit_point")]
        [Validation(Required=false, MaxLength=100)]
        public string TransitPoint { get; set; }

        // 目的地
        [NameInMap("destination")]
        [Validation(Required=true, MaxLength=200)]
        public string Destination { get; set; }

        // 理赔代理地代码，参考保司提供样例-理赔代理地
        [NameInMap("claim_agent_code")]
        [Validation(Required=true, MaxLength=30)]
        public string ClaimAgentCode { get; set; }

        // 主险条款代码--参考保司提供样例
        [NameInMap("main_item_code")]
        [Validation(Required=true, MaxLength=12)]
        public string MainItemCode { get; set; }

        // 主险条款内容--参考保司提供样例
        [NameInMap("main_item_content")]
        [Validation(Required=true, MaxLength=500)]
        public string MainItemContent { get; set; }

        // 附加条款集合
        [NameInMap("main_item_adds")]
        [Validation(Required=false)]
        public List<MainItemAdd> MainItemAdds { get; set; }

        // 特别约定--填写协议中的特别约定
        [NameInMap("specialize")]
        [Validation(Required=false, MaxLength=500)]
        public string Specialize { get; set; }

        // 申报货物价值,，最多兼容2位小数，单位（元）
        [NameInMap("cargo_worth")]
        [Validation(Required=true, MaxLength=50)]
        public string CargoWorth { get; set; }

        // 费率，最多兼容9位小数
        [NameInMap("rate")]
        [Validation(Required=true)]
        public string Rate { get; set; }

        // 保费，最多兼容2位小数，单位（元）
        [NameInMap("premium")]
        [Validation(Required=true)]
        public string Premium { get; set; }

        // 保险起期，日期格式yyyy-mm-dd
        [NameInMap("insure_start")]
        [Validation(Required=true)]
        public string InsureStart { get; set; }

        // 起运日期，日期格式yyyy-mm-dd
        [NameInMap("sale_date")]
        [Validation(Required=true)]
        public string SaleDate { get; set; }

    }

}
