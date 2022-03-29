// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // topic队列信息
    public class TopicQueueDTO : TeaModel {
        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // Broker 名称
        [NameInMap("broker_name")]
        [Validation(Required=true)]
        public string BrokerName { get; set; }

        // brokerip地址
        [NameInMap("broker_addr_str")]
        [Validation(Required=true)]
        public string BrokerAddrStr { get; set; }

        // 最后更新时间
        [NameInMap("last_update_timestamp")]
        [Validation(Required=true)]
        public long? LastUpdateTimestamp { get; set; }

        // 最大 offset 位点
        [NameInMap("max_offset")]
        [Validation(Required=true)]
        public long? MaxOffset { get; set; }

        // 最小位点
        [NameInMap("min_offset")]
        [Validation(Required=true)]
        public long? MinOffset { get; set; }

        // 队列 ID
        [NameInMap("queue_id")]
        [Validation(Required=true)]
        public long? QueueId { get; set; }

    }

}
