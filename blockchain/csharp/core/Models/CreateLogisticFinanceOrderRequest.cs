// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class CreateLogisticFinanceOrderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用户链上账户
        // 与司机did 二选一填写
        [NameInMap("account_id")]
        [Validation(Required=false)]
        public string AccountId { get; set; }

        // 运费
        [NameInMap("all_freight")]
        [Validation(Required=false)]
        public string AllFreight { get; set; }

        // 回单押金
        // 
        [NameInMap("back_fee")]
        [Validation(Required=false)]
        public string BackFee { get; set; }

        // 货源单号
        [NameInMap("cargo_order")]
        [Validation(Required=false)]
        public string CargoOrder { get; set; }

        // 车牌颜色
        [NameInMap("cart_badge_color")]
        [Validation(Required=true)]
        public string CartBadgeColor { get; set; }

        // 车牌号
        [NameInMap("cart_badge_no")]
        [Validation(Required=true)]
        public string CartBadgeNo { get; set; }

        // 建单时间
        [NameInMap("created_time")]
        [Validation(Required=true)]
        public long? CreatedTime { get; set; }

        // 受票方名称
        [NameInMap("drawee")]
        [Validation(Required=true)]
        public string Drawee { get; set; }

        // 受票方纳税人识别号
        [NameInMap("drawee_tax_no")]
        [Validation(Required=true)]
        public string DraweeTaxNo { get; set; }

        // 司机分布式身份
        [NameInMap("driver_did")]
        [Validation(Required=false)]
        public string DriverDid { get; set; }

        // 司机姓名
        // 已填司机分布式身份的情况下可不填
        [NameInMap("driver_name")]
        [Validation(Required=false)]
        public string DriverName { get; set; }

        // 目的地城市CODE
        [NameInMap("end_city_code")]
        [Validation(Required=true)]
        public string EndCityCode { get; set; }

        // 目的地城市名称
        [NameInMap("end_city_name")]
        [Validation(Required=true)]
        public string EndCityName { get; set; }

        // 目的地区县CODE
        [NameInMap("end_county_code")]
        [Validation(Required=false)]
        public string EndCountyCode { get; set; }

        // 目的地区县名称
        [NameInMap("end_county_name")]
        [Validation(Required=false)]
        public string EndCountyName { get; set; }

        // 结束行政区划代码
        [NameInMap("end_division_code")]
        [Validation(Required=true)]
        public string EndDivisionCode { get; set; }

        // 目的地省份CODE
        [NameInMap("end_province_code")]
        [Validation(Required=true)]
        public string EndProvinceCode { get; set; }

        // 目的地省份名称
        [NameInMap("end_province_name")]
        [Validation(Required=true)]
        public string EndProvinceName { get; set; }

        // 运费增项
        [NameInMap("freight_incr")]
        [Validation(Required=false)]
        public string FreightIncr { get; set; }

        // 货物数量
        [NameInMap("goods_amount")]
        [Validation(Required=false)]
        public long? GoodsAmount { get; set; }

        // 货物数量单位类型
        [NameInMap("goods_amount_type")]
        [Validation(Required=false)]
        public string GoodsAmountType { get; set; }

        // 货物名称
        [NameInMap("goods_name")]
        [Validation(Required=true)]
        public string GoodsName { get; set; }

        // 司机身份证号
        // 已填司机分布式身份的情况下可不填
        [NameInMap("id_card")]
        [Validation(Required=false)]
        public string IdCard { get; set; }

        // 运费扣减
        // 
        [NameInMap("loss_fee")]
        [Validation(Required=false)]
        public string LossFee { get; set; }

        // 司机手机号
        // 已填司机分布式身份的情况下可不填
        [NameInMap("mobile_no")]
        [Validation(Required=false)]
        public string MobileNo { get; set; }

        // 系统识别id
        // 网商识别号
        [NameInMap("partner_id")]
        [Validation(Required=false)]
        public string PartnerId { get; set; }

        // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        [NameInMap("platform_did")]
        [Validation(Required=false)]
        public string PlatformDid { get; set; }

        // 预付款金额
        [NameInMap("prepayments")]
        [Validation(Required=false)]
        public string Prepayments { get; set; }

        // 线下预付ETC
        [NameInMap("prepayments_buy_etc")]
        [Validation(Required=false)]
        public string PrepaymentsBuyEtc { get; set; }

        // 线下气款金额
        [NameInMap("prepayments_buy_gas")]
        [Validation(Required=false)]
        public string PrepaymentsBuyGas { get; set; }

        // 线下油款预付
        [NameInMap("prepayments_buy_oil")]
        [Validation(Required=false)]
        public string PrepaymentsBuyOil { get; set; }

        // 预付ETC卡金额
        [NameInMap("prepayments_etccard")]
        [Validation(Required=false)]
        public string PrepaymentsEtccard { get; set; }

        // 预付油卡金额
        [NameInMap("prepayments_oilcard")]
        [Validation(Required=false)]
        public string PrepaymentsOilcard { get; set; }

        // 油卡赠送金额
        [NameInMap("present_amount_oil")]
        [Validation(Required=false)]
        public string PresentAmountOil { get; set; }

        // 起始地CODE
        [NameInMap("start_city_code")]
        [Validation(Required=true)]
        public string StartCityCode { get; set; }

        // 起始地城市名称
        [NameInMap("start_city_name")]
        [Validation(Required=true)]
        public string StartCityName { get; set; }

        // 起始地区县CODE
        [NameInMap("start_county_code")]
        [Validation(Required=false)]
        public string StartCountyCode { get; set; }

        // 起始地区县名称
        [NameInMap("start_county_name")]
        [Validation(Required=false)]
        public string StartCountyName { get; set; }

        // 起始行政区划代码
        [NameInMap("start_division_code")]
        [Validation(Required=true)]
        public string StartDivisionCode { get; set; }

        // 起始地省份CODE
        [NameInMap("start_province_code")]
        [Validation(Required=true)]
        public string StartProvinceCode { get; set; }

        // 起始地省份名称
        [NameInMap("start_province_name")]
        [Validation(Required=true)]
        public string StartProvinceName { get; set; }

        // 起运时间戳
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 运单id
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

        // 运输单价
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

    }

}
