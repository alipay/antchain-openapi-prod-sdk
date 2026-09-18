// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryEtcVehicleRequest : TeaModel {
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
        [Validation(Required=false)]
        public string WaybillNo { get; set; }

    }

}
