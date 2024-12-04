// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // ETC行程信息
    public class EtcTripInfo : TeaModel {
        // 发行方扣款订单号
        [NameInMap("out_order_id")]
        [Validation(Required=false)]
        public string OutOrderId { get; set; }

        // 行程开始时间
        [NameInMap("trip_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TripStartTime { get; set; }

        // 行程结束时间
        [NameInMap("trip_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TripEndTime { get; set; }

        // 1、收费站入口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
        [NameInMap("start_station_name")]
        [Validation(Required=false)]
        public string StartStationName { get; set; }

        // 1、收费站出口名称 2、格式为省份+收费站名，比如“黑龙江瓦盆窑西站”
        [NameInMap("end_station_name")]
        [Validation(Required=false)]
        public string EndStationName { get; set; }

        // HIGHWAY_TYPE：高速交易场景类型，对应具体交易场景[ETC_HIGHWAY,ETC_HIGHWAY_OPEN] EXPAND_TYPE：拓展消费交易类型，对应具体交易场景 [ETC_PARKING,ETC_GAS,ETC_SERVICE_AREA,ETC_MUNICIPAL_SERVICE]
        [NameInMap("sub_type")]
        [Validation(Required=false)]
        public string SubType { get; set; }

        // ETC_HIGHWAY：ETC封闭式高速公路； ETC_HIGHWAY_OPEN：ETC开放式高速公路； ETC_PARKING：ETC停车场； ETC_GAS：ETC加油站； ETC_SERVICE_AREA：ETC服务区； ETC_MUNICIPAL_SERVICE：ETC市政服务
        [NameInMap("sub_scene")]
        [Validation(Required=false)]
        public string SubScene { get; set; }

        // 商户扣费的总金额：单位为元，精确到小数点后两位
        [NameInMap("total_amount")]
        [Validation(Required=false)]
        public string TotalAmount { get; set; }

        // 行程id
        [NameInMap("trip_id")]
        [Validation(Required=false)]
        public string TripId { get; set; }

        // 交易单号
        [NameInMap("trade_no")]
        [Validation(Required=false)]
        public string TradeNo { get; set; }

    }

}
