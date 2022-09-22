// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INTEGRATION_MACHINE.Models
{
    public class QueryDevicestatisticsRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备SN号(最大限制100条)
        [NameInMap("serial_no_list")]
        [Validation(Required=true)]
        public List<string> SerialNoList { get; set; }

        // 厂商名称
        // 为空时:默认值telpo(天波)
        // 可用枚举值:
        // telpo(天波) 
        // hemiao(禾苗)
        [NameInMap("crop_name")]
        [Validation(Required=false)]
        public string CropName { get; set; }

        // 开始时间(精确到ms)
        [NameInMap("start_time")]
        [Validation(Required=true)]
        public long? StartTime { get; set; }

        // 结束时间(精确到ms,时间跨度不能超过24h)
        [NameInMap("end_time")]
        [Validation(Required=true)]
        public long? EndTime { get; set; }

    }

}
