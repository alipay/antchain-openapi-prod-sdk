// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // ConsumerTimeSpan查询结果
    public class ConsumerTimeSpanDTO : TeaModel {
        //  当前 Group 消费该 Topic 的最新的时间
        [NameInMap("consume_timestamp")]
        [Validation(Required=true)]
        public long? ConsumeTimestamp { get; set; }

        // 需查询的消费端 Group ID 所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 整个 Topic 目前存储的最早的消息的时间
        [NameInMap("max_timestamp")]
        [Validation(Required=true)]
        public long? MaxTimestamp { get; set; }

        //  整个 Topic 目前存储的最新的消息的时间
        [NameInMap("min_timestamp")]
        [Validation(Required=true)]
        public long? MinTimestamp { get; set; }

        // 需查询的 Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
