// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 该集群在线客户端详细信息，包含 Jstack、消费 RT 时间等信息
    public class ConsumerConnectionInfoDTO : TeaModel {
        // 消费实例的 ID
        [NameInMap("client_id")]
        [Validation(Required=true)]
        public string ClientId { get; set; }

        // 连接信息
        [NameInMap("connection")]
        [Validation(Required=true)]
        public string Connection { get; set; }

        // PUSH/PULL
        [NameInMap("consume_type")]
        [Validation(Required=true)]
        public string ConsumeType { get; set; }

        // Jstack 堆栈信息
        [NameInMap("jstack")]
        [Validation(Required=true)]
        public List<ThreadTrackDTO> Jstack { get; set; }

        // 客户端语言
        [NameInMap("language")]
        [Validation(Required=true)]
        public string Language { get; set; }

        // 最后更新时间
        [NameInMap("last_timestamp")]
        [Validation(Required=true)]
        public long? LastTimestamp { get; set; }

        // 消费模型，取值说明如下：CLUSTERING：集群消费模式；BROADCASTING：广播消费模式。
        [NameInMap("message_model")]
        [Validation(Required=true)]
        public string MessageModel { get; set; }

        // 实时状态统计
        [NameInMap("running_data_list")]
        [Validation(Required=true)]
        public List<ConsumerRunningDataDTO> RunningDataList { get; set; }

        // 开始时间
        [NameInMap("start_timestamp")]
        [Validation(Required=true)]
        public long? StartTimestamp { get; set; }

        // 订阅关系集合
        [NameInMap("subscription_set")]
        [Validation(Required=true)]
        public List<SubscriptionDTO> SubscriptionSet { get; set; }

        // 消费线程数
        [NameInMap("thread_count")]
        [Validation(Required=true)]
        public long? ThreadCount { get; set; }

        //  客户端版本号
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

    }

}
