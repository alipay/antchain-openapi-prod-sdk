// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // topic 监控数据点的值
    public class TopicMetricItem : TeaModel {
        // 当前时间点 Topic 消费的消息数量
        [NameInMap("recv_cnt")]
        [Validation(Required=true)]
        public long? RecvCnt { get; set; }

        // 当前时间点 Topic 消费的消息流量（byte）
        [NameInMap("recv_traffic")]
        [Validation(Required=true)]
        public long? RecvTraffic { get; set; }

        // 当前时间点 Topic 发送的消息数量
        [NameInMap("send_cnt")]
        [Validation(Required=true)]
        public long? SendCnt { get; set; }

        // 当前时间点 Topic 发送的消息流量（byte）
        [NameInMap("send_traffic")]
        [Validation(Required=true)]
        public long? SendTraffic { get; set; }

        // 数据点的时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
