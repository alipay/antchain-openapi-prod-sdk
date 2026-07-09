// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class ExecElectrocarBatchpubRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 设备tuid列表
        [NameInMap("tuid_list")]
        [Validation(Required=true)]
        public List<string> TuidList { get; set; }

        // 用户自定义Topic
        [NameInMap("user_topic")]
        [Validation(Required=true)]
        public string UserTopic { get; set; }

        // 消息类型
        [NameInMap("message_type")]
        [Validation(Required=true)]
        public string MessageType { get; set; }

        // 消息内容
        [NameInMap("message_content")]
        [Validation(Required=true)]
        public string MessageContent { get; set; }

        // 触发模式（IMMEDIATE/SCHEDULED）
        [NameInMap("trigger_mode")]
        [Validation(Required=true)]
        public string TriggerMode { get; set; }

        // 定时执行时间戳（triggerMode为SCHEDULED时必填）
        [NameInMap("schedule_time")]
        [Validation(Required=false)]
        public long? ScheduleTime { get; set; }

        // 批次名称
        [NameInMap("batch_name")]
        [Validation(Required=false)]
        public string BatchName { get; set; }

        // 重试次数
        [NameInMap("retry_count")]
        [Validation(Required=false)]
        public long? RetryCount { get; set; }

        // 操作人
        [NameInMap("operator")]
        [Validation(Required=false)]
        public string Operator { get; set; }

    }

}
