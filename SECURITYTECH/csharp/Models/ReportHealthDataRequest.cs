// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class ReportHealthDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备唯一id
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 上报时间时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

        // 数据类别 健康指标:HEALTH_METRIC/GPS定位:GPS_LOCATION/告警事件:ALERT_EVENT/设备信息:DEVICE_INFO
        [NameInMap("data_category")]
        [Validation(Required=true)]
        public string DataCategory { get; set; }

        // 数据内容 json传输，与不同category一一映射
        [NameInMap("payload")]
        [Validation(Required=true)]
        public string Payload { get; set; }

    }

}
