// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class CreateTransportWaybillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 运费，3pl支付给下承运商的运费金额，单位（元），要求格式为不超过二位小数
        [NameInMap("all_freight")]
        [Validation(Required=true)]
        public string AllFreight { get; set; }

        // 货物名称
        [NameInMap("cargo_name")]
        [Validation(Required=true)]
        public string CargoName { get; set; }

        // 货物体积，单位（方）。货物重量、货物体积二选一填写
        [NameInMap("cargo_volume")]
        [Validation(Required=false)]
        public string CargoVolume { get; set; }

        // 货物重量，单位（吨）。货物重量、货物体积二选一填写
        [NameInMap("cargo_weight")]
        [Validation(Required=false)]
        public string CargoWeight { get; set; }

        // 下游承运商did，一般为下一级承运商数字身份
        [NameInMap("carrier_did")]
        [Validation(Required=true)]
        public string CarrierDid { get; set; }

        // 车牌颜色，需填写黄色、蓝色、绿色中的一种
        [NameInMap("car_badge_color")]
        [Validation(Required=true)]
        public string CarBadgeColor { get; set; }

        // 车牌号，承运车牌号
        [NameInMap("car_badge_no")]
        [Validation(Required=true)]
        public string CarBadgeNo { get; set; }

        // 货主did，一般为合同甲方的链上数字身份
        [NameInMap("consignor_did")]
        [Validation(Required=true)]
        public string ConsignorDid { get; set; }

        // 创建时间，13位毫秒级时间戳
        [NameInMap("create_time")]
        [Validation(Required=true)]
        public long? CreateTime { get; set; }

        // 实际承运司机did，实际承运司机的链上数字身份
        [NameInMap("driver_did")]
        [Validation(Required=true)]
        public string DriverDid { get; set; }

        // 目的地省市区，要求格式 XX省-XX市-XX区，比如四川省-成都市-青白江区
        [NameInMap("end_address")]
        [Validation(Required=true)]
        public string EndAddress { get; set; }

        // 目的地详细地址，街道村社区道路楼宇门牌号
        [NameInMap("end_detailed_address")]
        [Validation(Required=true)]
        public string EndDetailedAddress { get; set; }

        // 货物数量
        [NameInMap("goods_amount")]
        [Validation(Required=false)]
        public long? GoodsAmount { get; set; }

        // 货物数量单位类型
        [NameInMap("goods_amount_type")]
        [Validation(Required=false)]
        public string GoodsAmountType { get; set; }

        // 起始地省市区，要求格式 XX省-XX市-XX区。比如浙江省-杭州市-余杭区
        [NameInMap("start_address")]
        [Validation(Required=true)]
        public string StartAddress { get; set; }

        // 起始地详细地址，街道村社区道路楼宇门牌号
        [NameInMap("start_detailed_address")]
        [Validation(Required=true)]
        public string StartDetailedAddress { get; set; }

        // 客户系统内运单编号
        [NameInMap("tax_waybill_id")]
        [Validation(Required=true)]
        public string TaxWaybillId { get; set; }

        // 3plDid，一般为合同乙方的链上数字身份
        [NameInMap("third_party_logistics_did")]
        [Validation(Required=true)]
        public string ThirdPartyLogisticsDid { get; set; }

        // 所属合同编号
        [NameInMap("transport_contract_code")]
        [Validation(Required=false)]
        public string TransportContractCode { get; set; }

        // 所属运输线路编码
        [NameInMap("transport_route_code")]
        [Validation(Required=false)]
        public string TransportRouteCode { get; set; }

        // 托盘方did
        [NameInMap("pallet_did")]
        [Validation(Required=false)]
        public string PalletDid { get; set; }

    }

}
