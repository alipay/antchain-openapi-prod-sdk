// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryEtcTripRequest : TeaModel {
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

        // 车牌颜色，蓝: BLUE 黄: YELLOW 黑: BLACK 白: WHITE 绿: GREEN
        [NameInMap("plate_color")]
        [Validation(Required=true)]
        public string PlateColor { get; set; }

        // 企业运单号，唯一值
        [NameInMap("waybill_no")]
        [Validation(Required=true)]
        public string WaybillNo { get; set; }

        // 当前页码
        // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
        [NameInMap("page_num")]
        [Validation(Required=false)]
        public long? PageNum { get; set; }

        // 每页数据条数
        // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
        [NameInMap("page_size")]
        [Validation(Required=false)]
        public long? PageSize { get; set; }

        // 行程查询开始时间
        // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
        [NameInMap("start_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string StartTime { get; set; }

        // 行程查询结束时间
        // 【必选条件】当需要进行按时间段（跨度不超过2天）筛选时需要传入，不传入时默认至多返回最新20条数据
        // 
        [NameInMap("end_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string EndTime { get; set; }

    }

}
