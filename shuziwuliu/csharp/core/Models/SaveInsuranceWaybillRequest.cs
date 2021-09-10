// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SHUZIWULIU.Models
{
    public class SaveInsuranceWaybillRequest : TeaModel {
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
        // 
        [NameInMap("trade_no")]
        [Validation(Required=true, MaxLength=50)]
        public string TradeNo { get; set; }

        // 运单号，客户侧系统的运单唯一识别号
        [NameInMap("waybill_no")]
        [Validation(Required=true, MaxLength=200)]
        public string WaybillNo { get; set; }

        // 发货单位，客户唯一识别码或脱敏标识
        [NameInMap("delivery_company")]
        [Validation(Required=false, MaxLength=200)]
        public string DeliveryCompany { get; set; }

        // 发货人，客户唯一识别码或脱敏标识
        [NameInMap("consignor")]
        [Validation(Required=true, MaxLength=200)]
        public string Consignor { get; set; }

        // 发货地址，地址可脱敏，不需要精确到门牌号
        [NameInMap("delivery_address")]
        [Validation(Required=false, MaxLength=500)]
        public string DeliveryAddress { get; set; }

        // 货物名称
        [NameInMap("cargo_name")]
        [Validation(Required=true, MaxLength=500)]
        public string CargoName { get; set; }

        // 货物数量，单位（件）
        [NameInMap("cargo_quantity")]
        [Validation(Required=true, MaxLength=20)]
        public string CargoQuantity { get; set; }

        // 货物重量，单位（kg）
        [NameInMap("cargo_weight")]
        [Validation(Required=false, MaxLength=20)]
        public string CargoWeight { get; set; }

        // 货物体积，单位（方）
        [NameInMap("cargo_dimensions")]
        [Validation(Required=false, MaxLength=20)]
        public string CargoDimensions { get; set; }

        // 揽件网点，货物出发地的揽件网点
        [NameInMap("pickup_outlets")]
        [Validation(Required=false, MaxLength=200)]
        public string PickupOutlets { get; set; }

        // 出发站，专线出发站点
        [NameInMap("departure_station")]
        [Validation(Required=true, MaxLength=200)]
        public string DepartureStation { get; set; }

        // 到达站，专线到达站点
        [NameInMap("destination_station")]
        [Validation(Required=true, MaxLength=200)]
        public string DestinationStation { get; set; }

        // 派件网点，货物目的地的派件网点
        [NameInMap("dispatch_outlets")]
        [Validation(Required=false, MaxLength=200)]
        public string DispatchOutlets { get; set; }

        // 收货人，客户唯一识别码或脱敏标识
        [NameInMap("consignee")]
        [Validation(Required=false, MaxLength=200)]
        public string Consignee { get; set; }

        // 收货地址，地址可脱敏，不需要精确到门牌号
        [NameInMap("receiving_address")]
        [Validation(Required=false, MaxLength=500)]
        public string ReceivingAddress { get; set; }

        // 干线承运商
        [NameInMap("trunk_line_carrier")]
        [Validation(Required=false, MaxLength=200)]
        public string TrunkLineCarrier { get; set; }

        // 干线车牌号
        [NameInMap("trunk_line_car_number")]
        [Validation(Required=false, MaxLength=20)]
        public string TrunkLineCarNumber { get; set; }

        // 司机姓名
        [NameInMap("driver_name")]
        [Validation(Required=false, MaxLength=200)]
        public string DriverName { get; set; }

        // 司机联系方式
        [NameInMap("driver_contact")]
        [Validation(Required=false, MaxLength=20)]
        public string DriverContact { get; set; }

        // 运单创建时间，格式：yyyy-mm-dd hh:mm:ss
        [NameInMap("waybill_create_time")]
        [Validation(Required=true)]
        public string WaybillCreateTime { get; set; }

        // 干线运输发车时间，格式要求：yyyy-mm-dd hh:mm:ss
        [NameInMap("trunk_line_departure_time")]
        [Validation(Required=false)]
        public string TrunkLineDepartureTime { get; set; }

        // 干线运输到达时间，格式要求：yyyy-mm-dd hh:mm:ss
        [NameInMap("trunk_line_arrival_time")]
        [Validation(Required=false)]
        public string TrunkLineArrivalTime { get; set; }

        // 运费总金额，单位（元），最多2位小数
        [NameInMap("freight")]
        [Validation(Required=true)]
        public string Freight { get; set; }

        // 运单状态，客户系统中实际的当前运单状态
        [NameInMap("waybill_status")]
        [Validation(Required=true, MaxLength=200)]
        public string WaybillStatus { get; set; }

        // 提货车牌号
        [NameInMap("take_cargo_car_number")]
        [Validation(Required=false, MaxLength=20)]
        public string TakeCargoCarNumber { get; set; }

        // 短驳车牌号
        [NameInMap("short_barge_car_number")]
        [Validation(Required=false, MaxLength=20)]
        public string ShortBargeCarNumber { get; set; }

        // 送货车牌号
        [NameInMap("delivery_car_number")]
        [Validation(Required=false, MaxLength=20)]
        public string DeliveryCarNumber { get; set; }

        // 运单操作类型，CREATE -创建，UPDATE-更新
        [NameInMap("waybill_action_type")]
        [Validation(Required=true, MaxLength=20)]
        public string WaybillActionType { get; set; }

    }

}
