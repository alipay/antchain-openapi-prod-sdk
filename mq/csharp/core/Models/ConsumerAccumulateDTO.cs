// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // Consumer 的消费堆积情况信息
    public class ConsumerAccumulateDTO : TeaModel {
        // 该 Group ID 下消费者实例群组接收消息的总 TPS
        [NameInMap("consume_tps")]
        [Validation(Required=true)]
        public string ConsumeTps { get; set; }

        // 该 Topic 所发消息的最大消费延迟时间
        [NameInMap("delay_time")]
        [Validation(Required=true)]
        public long? DelayTime { get; set; }

        // 各个 Topic 具体情况
        [NameInMap("detail_in_topic_list")]
        [Validation(Required=true)]
        public List<DetailInTopicDTO> DetailInTopicList { get; set; }

        // 该 Topic 中最近一条被消费的信息的生产时间
        [NameInMap("last_timestamp")]
        [Validation(Required=true)]
        public long? LastTimestamp { get; set; }

        // 该 Group ID 下是否有消费者实例在线；只要有一个消费者实例在线，该 Group ID 状态即为在线。取值说明如下：
        // 
        // true：状态为在线
        // false：状态为不在线
        [NameInMap("online")]
        [Validation(Required=true)]
        public bool? Online { get; set; }

        // 该 Topic 的消费堆积数量
        [NameInMap("total_diff")]
        [Validation(Required=true)]
        public long? TotalDiff { get; set; }

    }

}
