// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // Group 统计列表详情
    public class GroupStatsItem : TeaModel {
        // 每分钟消息大小
        [NameInMap("bpm")]
        [Validation(Required=true)]
        public long? Bpm { get; set; }

        // 死信数量
        [NameInMap("dlq")]
        [Validation(Required=true)]
        public long? Dlq { get; set; }

        // 消费组 Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 当前 Group 消息积压的数量
        [NameInMap("msg_backlog")]
        [Validation(Required=true)]
        public long? MsgBacklog { get; set; }

        // 当前每分钟 Group ID 拉请求数量
        [NameInMap("ppm")]
        [Validation(Required=true)]
        public long? Ppm { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 每分钟拉取的消息数量
        [NameInMap("tpm")]
        [Validation(Required=true)]
        public long? Tpm { get; set; }

        // 每天拉取的消息数量
        [NameInMap("tpd")]
        [Validation(Required=true)]
        public long? Tpd { get; set; }

    }

}
