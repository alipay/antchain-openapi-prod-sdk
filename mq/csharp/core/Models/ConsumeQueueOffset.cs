// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 队列的消费offset相关信息
    public class ConsumeQueueOffset : TeaModel {
        // topic
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // queue所在broker的名字
        [NameInMap("broker_name")]
        [Validation(Required=true)]
        public string BrokerName { get; set; }

        // queue id
        [NameInMap("queue_id")]
        [Validation(Required=true)]
        public long? QueueId { get; set; }

        // 消费位点
        [NameInMap("broker_offset")]
        [Validation(Required=true)]
        public long? BrokerOffset { get; set; }

        // 消费端offset
        [NameInMap("consumer_offset")]
        [Validation(Required=true)]
        public long? ConsumerOffset { get; set; }

        // 最后时间（时间戳）
        // 
        [NameInMap("last_timestamp")]
        [Validation(Required=true)]
        public long? LastTimestamp { get; set; }

        // 消费端地址
        [NameInMap("client_addr")]
        [Validation(Required=true)]
        public string ClientAddr { get; set; }

        // 消费者客户端id
        // 
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 消息堆积数
        // 
        [NameInMap("accumulate")]
        [Validation(Required=true)]
        public long? Accumulate { get; set; }

        // queue位点和消费端位点差
        [NameInMap("difference")]
        [Validation(Required=true)]
        public long? Difference { get; set; }

    }

}
