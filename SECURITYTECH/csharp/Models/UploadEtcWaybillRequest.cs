// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class UploadEtcWaybillRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求ID，为32位以内的字母数字组合，由调用方自行生成、保证唯一并留存，以便问题定位。
        [NameInMap("outer_order_no")]
        [Validation(Required=true)]
        public string OuterOrderNo { get; set; }

        // 企业侧车辆编号
        [NameInMap("corp_vehicle_id")]
        [Validation(Required=true)]
        public string CorpVehicleId { get; set; }

        // 车牌号码
        [NameInMap("plate_no")]
        [Validation(Required=true)]
        public string PlateNo { get; set; }

        // 车牌颜色，枚举值
        // 蓝: BLUE
        // 黄: YELLOW
        // 黑: BLACK
        // 白: WHITE
        // 绿: GREEN
        [NameInMap("plate_color")]
        [Validation(Required=true)]
        public string PlateColor { get; set; }

        // 企业运单号，唯一值
        [NameInMap("waybill_no")]
        [Validation(Required=true)]
        public string WaybillNo { get; set; }

        // 企业运单状态，枚举值
        // 进行中: IN_PROGRESS
        // 已完成: COMPLETED
        // 已取消: CANCELED
        [NameInMap("waybill_status")]
        [Validation(Required=true)]
        public string WaybillStatus { get; set; }

        // 运单开始时间
        // 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
        [NameInMap("waybill_start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string WaybillStartTime { get; set; }

        // 企业运单结束时间
        // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
        [NameInMap("waybill_end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string WaybillEndTime { get; set; }

        // 运单开始地址
        // 【必选条件】当传入waybill_status，且waybill_status= IN_PROGRESS时必选
        [NameInMap("waybill_start_address")]
        [Validation(Required=false)]
        public string WaybillStartAddress { get; set; }

        // 运单结束地址，运单目的地
        // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
        [NameInMap("waybill_end_address")]
        [Validation(Required=false)]
        public string WaybillEndAddress { get; set; }

        // 运单总费用，单位元，精确到两位小数
        // 【必选条件】当传入waybill_status，且waybill_status=COMPLETED时必选
        [NameInMap("waybill_fee")]
        [Validation(Required=false)]
        public string WaybillFee { get; set; }

        // 高速通行费用，单位元，精确到两位小数
        [NameInMap("highway_fee")]
        [Validation(Required=false)]
        public string HighwayFee { get; set; }

    }

}
