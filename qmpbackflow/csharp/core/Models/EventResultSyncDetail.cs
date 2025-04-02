// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 营销盾事件信息同步详情
    public class EventResultSyncDetail : TeaModel {
        // 事件唯一id（单个租户全局唯一）
        [NameInMap("event_id")]
        [Validation(Required=true)]
        public string EventId { get; set; }

        // 营销计划id
        [NameInMap("plan_id")]
        [Validation(Required=true)]
        public string PlanId { get; set; }

        // 消息id
        [NameInMap("msg_id")]
        [Validation(Required=true)]
        public string MsgId { get; set; }

        // 事件时间
        [NameInMap("event_time")]
        [Validation(Required=true)]
        public string EventTime { get; set; }

        // 事件类型：1为富信贴尾
        [NameInMap("event_type")]
        [Validation(Required=true)]
        public long? EventType { get; set; }

        // 1为成功 2为失败
        [NameInMap("state")]
        [Validation(Required=true)]
        public long? State { get; set; }

        // 用户key类型
        [NameInMap("key_type")]
        [Validation(Required=true)]
        public string KeyType { get; set; }

        // 手机号
        [NameInMap("customer_key")]
        [Validation(Required=true)]
        public string CustomerKey { get; set; }

        // 扩展字段
        [NameInMap("ext_data")]
        [Validation(Required=true)]
        public string ExtData { get; set; }

    }

}
