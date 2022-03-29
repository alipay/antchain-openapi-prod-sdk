// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // Topic Group历史统计数据点
    public class TopicGroupHistoryStatsItem : TeaModel {
        // 当前时间点的死信数量
        [NameInMap("dlq")]
        [Validation(Required=true)]
        public long? Dlq { get; set; }

        // 当前时间点的消息积压量
        [NameInMap("msg_backlog")]
        [Validation(Required=true)]
        public long? MsgBacklog { get; set; }

        // 每分钟消费数据大小
        [NameInMap("recv_bpm")]
        [Validation(Required=true)]
        public long? RecvBpm { get; set; }

        // 每分钟拉请求数量
        [NameInMap("recv_ppm")]
        [Validation(Required=true)]
        public long? RecvPpm { get; set; }

        // 消费 TPM
        [NameInMap("recv_tpm")]
        [Validation(Required=true)]
        public long? RecvTpm { get; set; }

        // 每分钟发送消息大小
        [NameInMap("send_bpm")]
        [Validation(Required=true)]
        public long? SendBpm { get; set; }

        // 发送 TPM
        [NameInMap("send_tpm")]
        [Validation(Required=true)]
        public long? SendTpm { get; set; }

        // Unix 时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
