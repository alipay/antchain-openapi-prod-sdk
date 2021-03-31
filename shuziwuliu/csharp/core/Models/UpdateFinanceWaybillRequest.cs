// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class UpdateFinanceWaybillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 运费，单位（元），平台支付给司机的运费
        [NameInMap("all_freight")]
        [Validation(Required=false)]
        public string AllFreight { get; set; }

        // 回单押金
        [NameInMap("back_fee")]
        [Validation(Required=false)]
        public string BackFee { get; set; }

        // 业务类型
        [NameInMap("business_type")]
        [Validation(Required=false)]
        public string BusinessType { get; set; }

        // 货物行业编码
        [NameInMap("cargo_business_code")]
        [Validation(Required=false)]
        public string CargoBusinessCode { get; set; }

        // 货物商品编码
        [NameInMap("cargo_code")]
        [Validation(Required=false)]
        public string CargoCode { get; set; }

        // 货物运费险
        [NameInMap("cargo_insurance_money")]
        [Validation(Required=false)]
        public string CargoInsuranceMoney { get; set; }

        // 货源单号
        [NameInMap("cargo_order")]
        [Validation(Required=false)]
        public string CargoOrder { get; set; }

        // 货物单位
        [NameInMap("cargo_unit")]
        [Validation(Required=false)]
        public string CargoUnit { get; set; }

        // 货物体积，单位（方）
        [NameInMap("cargo_volume")]
        [Validation(Required=false)]
        public string CargoVolume { get; set; }

        // 货物重量，单位（吨）
        [NameInMap("cargo_weight")]
        [Validation(Required=false)]
        public string CargoWeight { get; set; }

        // 车牌颜色，黄色、蓝色、绿色
        [NameInMap("cart_badge_color")]
        [Validation(Required=false)]
        public string CartBadgeColor { get; set; }

        // 车牌号
        [NameInMap("cart_badge_no")]
        [Validation(Required=false)]
        public string CartBadgeNo { get; set; }

        // 承运商did
        [NameInMap("car_captain_did")]
        [Validation(Required=false)]
        public string CarCaptainDid { get; set; }

        // 货主支付运费金额，货主支付给平台的运费金额
        [NameInMap("consignor_freight_amount")]
        [Validation(Required=false)]
        public string ConsignorFreightAmount { get; set; }

        // 建单时间，13位毫秒级时间戳
        [NameInMap("created_time")]
        [Validation(Required=false)]
        public long? CreatedTime { get; set; }

        // 到达门点时间，13位毫秒级时间戳
        [NameInMap("dest_doors_end_time")]
        [Validation(Required=false)]
        public string DestDoorsEndTime { get; set; }

        // 门点城市CODE，6位区域行政编码
        [NameInMap("doors_city_code")]
        [Validation(Required=false)]
        public string DoorsCityCode { get; set; }

        // 门点城市名称
        [NameInMap("doors_city_name")]
        [Validation(Required=false)]
        public string DoorsCityName { get; set; }

        // 门点区县CODE，6位区域行政编码
        [NameInMap("doors_county_code")]
        [Validation(Required=false)]
        public string DoorsCountyCode { get; set; }

        // 门点区县名称
        [NameInMap("doors_county_name")]
        [Validation(Required=false)]
        public string DoorsCountyName { get; set; }

        // 门点行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        [NameInMap("doors_division_code")]
        [Validation(Required=false)]
        public string DoorsDivisionCode { get; set; }

        // 门点省份CODE，6位行政区域编码
        [NameInMap("doors_province_code")]
        [Validation(Required=false)]
        public string DoorsProvinceCode { get; set; }

        // 门点省份名称
        [NameInMap("doors_province_name")]
        [Validation(Required=false)]
        public string DoorsProvinceName { get; set; }

        // 发货方名称
        [NameInMap("drawee")]
        [Validation(Required=false)]
        public string Drawee { get; set; }

        // 发货方纳税人识别号
        [NameInMap("drawee_tax_no")]
        [Validation(Required=false)]
        public string DraweeTaxNo { get; set; }

        // 司机分布式数字身份
        [NameInMap("driver_did")]
        [Validation(Required=false)]
        public string DriverDid { get; set; }

        // 目的地详细地址
        [NameInMap("end_address")]
        [Validation(Required=false)]
        public string EndAddress { get; set; }

        // 目的地城市CODE，6位区域行政编码
        [NameInMap("end_city_code")]
        [Validation(Required=false)]
        public string EndCityCode { get; set; }

        // 目的地城市名称
        [NameInMap("end_city_name")]
        [Validation(Required=false)]
        public string EndCityName { get; set; }

        // 目的地区县CODE
        [NameInMap("end_county_code")]
        [Validation(Required=false)]
        public string EndCountyCode { get; set; }

        // 目的地区县名称，6位区域行政编码
        [NameInMap("end_county_name")]
        [Validation(Required=false)]
        public string EndCountyName { get; set; }

        // 结束行政区划代码，12位区域行政编码，（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        [NameInMap("end_division_code")]
        [Validation(Required=false)]
        public string EndDivisionCode { get; set; }

        // 目的地省份CODE，6位区域行政编码
        [NameInMap("end_province_code")]
        [Validation(Required=false)]
        public string EndProvinceCode { get; set; }

        // 目的地省份名称
        [NameInMap("end_province_name")]
        [Validation(Required=false)]
        public string EndProvinceName { get; set; }

        // 目的地街道CODE，12位区域行政编码
        [NameInMap("end_street_code")]
        [Validation(Required=false)]
        public string EndStreetCode { get; set; }

        // 目的地街道名称
        [NameInMap("end_street_name")]
        [Validation(Required=false)]
        public string EndStreetName { get; set; }

        // 终结时间，13位毫秒级时间戳
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

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
        [Validation(Required=false)]
        public string GoodsName { get; set; }

        // 运费扣减
        [NameInMap("loss_fee")]
        [Validation(Required=false)]
        public string LossFee { get; set; }

        // 网商识别号
        [NameInMap("partner_id")]
        [Validation(Required=false)]
        public string PartnerId { get; set; }

        // 无车承运平台分布式数字身份，缺省时为自己的分布式数字身份
        // 
        [NameInMap("platform_did")]
        [Validation(Required=true)]
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

        // 起始地详细地址
        [NameInMap("start_address")]
        [Validation(Required=false)]
        public string StartAddress { get; set; }

        // 起始地CODE，6位区域行政编码
        [NameInMap("start_city_code")]
        [Validation(Required=false)]
        public string StartCityCode { get; set; }

        // 起始地城市名称
        [NameInMap("start_city_name")]
        [Validation(Required=false)]
        public string StartCityName { get; set; }

        // 起始地区县CODE，6位区域行政编码
        [NameInMap("start_county_code")]
        [Validation(Required=false)]
        public string StartCountyCode { get; set; }

        // 起始地区县名称
        [NameInMap("start_county_name")]
        [Validation(Required=false)]
        public string StartCountyName { get; set; }

        // 起始行政区划代码，12位区域行政编码（长途运输须准确提供前6位，如不能提供后6位可补0；短途运输须准确提供12位）
        [NameInMap("start_division_code")]
        [Validation(Required=false)]
        public string StartDivisionCode { get; set; }

        // 起始地省份CODE，6位区域行政编码
        [NameInMap("start_province_code")]
        [Validation(Required=false)]
        public string StartProvinceCode { get; set; }

        // 起始地省份名称
        [NameInMap("start_province_name")]
        [Validation(Required=false)]
        public string StartProvinceName { get; set; }

        // 起始地街道CODE，12位区域行政编码
        [NameInMap("start_street_code")]
        [Validation(Required=false)]
        public string StartStreetCode { get; set; }

        // 起始地街道名称
        [NameInMap("start_street_name")]
        [Validation(Required=false)]
        public string StartStreetName { get; set; }

        // 起运时间戳，13位毫秒级时间戳
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 运单id
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

        // 车长，可以填：不限车长或者1.8，2.7，3.8，4.2，5，6.2，6.8，7.7，8.2，8.7，9.6，11.7，12.5，13，13.7，15，16，17.5等不超过2位小数的数字
        [NameInMap("truck_length")]
        [Validation(Required=false)]
        public string TruckLength { get; set; }

        // 车型，可以填写：不限车型，平板，高栏，厢式，集装箱，自卸，冷藏，保温，高低板，面包车，棉被车，爬梯车，飞翼车
        [NameInMap("truck_type")]
        [Validation(Required=false)]
        public string TruckType { get; set; }

        // 运输单价
        [NameInMap("unit_price")]
        [Validation(Required=false)]
        public string UnitPrice { get; set; }

    }

}
