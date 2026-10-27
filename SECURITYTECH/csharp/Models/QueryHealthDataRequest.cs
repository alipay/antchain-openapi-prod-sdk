// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    public class QueryHealthDataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // channel_id
        [NameInMap("channel_id")]
        [Validation(Required=true)]
        public string ChannelId { get; set; }

        // 设备唯一id
        [NameInMap("tuid")]
        [Validation(Required=true)]
        public string Tuid { get; set; }

        // 指标类型 心率:HEART_RATE/血氧:BLOOD_OXYGEN/体温:BODY_TEMP/步数:STEPS/睡眠:SLEEP/呼吸率:RESP_RATE/压力:STRESS/疲劳:FATIGUE/情绪:EMOTION
        [NameInMap("metric_type")]
        [Validation(Required=false)]
        public string MetricType { get; set; }

        // 查询开始时间(毫秒级时间戳)
        [NameInMap("start_time")]
        [Validation(Required=false)]
        public long? StartTime { get; set; }

        // 查询结束时间（毫秒级时间戳）
        [NameInMap("end_time")]
        [Validation(Required=false)]
        public long? EndTime { get; set; }

        // 预留可扩展字段json
        [NameInMap("extra_info")]
        [Validation(Required=false)]
        public string ExtraInfo { get; set; }

    }

}
