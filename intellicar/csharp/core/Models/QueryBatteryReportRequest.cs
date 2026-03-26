// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTELLICAR.Models
{
    public class QueryBatteryReportRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 充电报告
        [NameInMap("battery_report")]
        [Validation(Required=true)]
        public BatteryReport BatteryReport { get; set; }

        // 桩所属运营平台
        [NameInMap("operator_platform")]
        [Validation(Required=true)]
        public string OperatorPlatform { get; set; }

        // 场站名称
        [NameInMap("station_name")]
        [Validation(Required=true)]
        public string StationName { get; set; }

        // 场站ID
        [NameInMap("station_id")]
        [Validation(Required=true)]
        public string StationId { get; set; }

        // 桩ID
        [NameInMap("pile_id")]
        [Validation(Required=true)]
        public string PileId { get; set; }

        // 枪序号（充电端口号）
        [NameInMap("gun_no")]
        [Validation(Required=true)]
        public long? GunNo { get; set; }

        // 充电订单号
        [NameInMap("charge_order_no")]
        [Validation(Required=true)]
        public string ChargeOrderNo { get; set; }

        // 充电量，单位kWh
        [NameInMap("charge_power")]
        [Validation(Required=true)]
        public string ChargePower { get; set; }

        // 服务费，单位元
        [NameInMap("service_fee")]
        [Validation(Required=true)]
        public string ServiceFee { get; set; }

        // 电费，单位元
        [NameInMap("electricity_fee")]
        [Validation(Required=true)]
        public string ElectricityFee { get; set; }

        // 充电开始时间
        [NameInMap("charge_start_time")]
        [Validation(Required=true)]
        public string ChargeStartTime { get; set; }

        // 充电结束时间
        [NameInMap("charge_end_time")]
        [Validation(Required=true)]
        public string ChargeEndTime { get; set; }

        // 租户场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
