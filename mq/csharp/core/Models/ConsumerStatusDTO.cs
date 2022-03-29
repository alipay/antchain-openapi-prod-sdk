// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // SofamqConsumerStatus返回数据
    public class ConsumerStatusDTO : TeaModel {
        // 该集群当前在线客户端信息
        [NameInMap("connection_set")]
        [Validation(Required=true)]
        public List<ConnectionDTO> ConnectionSet { get; set; }

        // 该集群在线客户端详细信息，包含 Jstack、消费 RT 时间等信息
        [NameInMap("consumer_connection_info_list")]
        [Validation(Required=true)]
        public List<ConsumerConnectionInfoDTO> ConsumerConnectionInfoList { get; set; }

        // 消费模型。取值说明如下：CLUSTERING：集群消费模式；BROADCASTING：广播消费模式。
        [NameInMap("consume_model")]
        [Validation(Required=true)]
        public string ConsumeModel { get; set; }

        // 总消费 TPS
        [NameInMap("consume_tps")]
        [Validation(Required=true)]
        public string ConsumeTps { get; set; }

        // 延迟时间
        [NameInMap("delay_time")]
        [Validation(Required=true)]
        public long? DelayTime { get; set; }

        // 各个 Topic 的消费情况
        [NameInMap("detail_in_topic_list")]
        [Validation(Required=true)]
        public List<DetailInTopicDTO> DetailInTopicList { get; set; }

        // 实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 最后更新时间
        [NameInMap("last_timestamp")]
        [Validation(Required=true)]
        public long? LastTimestamp { get; set; }

        // 是否在线
        [NameInMap("online")]
        [Validation(Required=true)]
        public bool? Online { get; set; }

        // 客户端 Rebalance 是否正常。取值说明如下：true：正常；false：不正常。
        [NameInMap("rebalance_ok")]
        [Validation(Required=true)]
        public bool? RebalanceOk { get; set; }

        // 订阅关系是否一致
        [NameInMap("subscription_same")]
        [Validation(Required=true)]
        public bool? SubscriptionSame { get; set; }

        // 集群总的消费堆积
        [NameInMap("total_diff")]
        [Validation(Required=true)]
        public long? TotalDiff { get; set; }

    }

}
