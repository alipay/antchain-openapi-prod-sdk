// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 消费状态查询结果
    public class ConsumptionStatusDTO : TeaModel {
        // 实例id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 消费端groupId
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 单元化cell
        [NameInMap("cell")]
        [Validation(Required=true)]
        public string Cell { get; set; }

        // 消费端是否在线
        [NameInMap("online")]
        [Validation(Required=true)]
        public bool? Online { get; set; }

        // 总的位点差
        [NameInMap("total_diff")]
        [Validation(Required=true)]
        public long? TotalDiff { get; set; }

        // 所有订阅关系
        [NameInMap("subscriptions")]
        [Validation(Required=true)]
        public List<SubscriptionDTO> Subscriptions { get; set; }

        // 消费者-队列状态
        [NameInMap("consumption_status")]
        [Validation(Required=true)]
        public List<ConsumeQueueOffset> ConsumptionStatus { get; set; }

        // 消费者客户端状态
        [NameInMap("clients")]
        [Validation(Required=true)]
        public List<ClientInfoDTO> Clients { get; set; }

    }

}
