// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // connector事件订阅配置
    public class EventSubConfig : TeaModel {
        // 配置是否开启
        [NameInMap("enabled")]
        [Validation(Required=true)]
        public bool? Enabled { get; set; }

        // 事件类型数组
        [NameInMap("event_types")]
        [Validation(Required=true)]
        public List<string> EventTypes { get; set; }

        // 事件触发通知类型
        [NameInMap("trigger_type")]
        [Validation(Required=true)]
        public string TriggerType { get; set; }

        // 钉钉通知的webhook
        [NameInMap("webhook")]
        [Validation(Required=false)]
        public string Webhook { get; set; }

        // http 连接
        [NameInMap("http_url")]
        [Validation(Required=false)]
        public string HttpUrl { get; set; }

        // topic
        [NameInMap("topic")]
        [Validation(Required=false)]
        public string Topic { get; set; }

        // tag
        [NameInMap("tag")]
        [Validation(Required=false)]
        public string Tag { get; set; }

    }

}
