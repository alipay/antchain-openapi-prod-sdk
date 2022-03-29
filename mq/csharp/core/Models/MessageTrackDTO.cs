// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 查询结果
    public class MessageTrackDTO : TeaModel {
        // 订阅该 Topic 的消费者所对应的 Group ID
        [NameInMap("consumer_group")]
        [Validation(Required=true)]
        public string ConsumerGroup { get; set; }

        // 需查询的消息所对应的实例 ID
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // 当前状态。取值说明如下：
        // 
        // CONSUMED：已消费
        // CONSUMED_BUT_FILTERED：已被过滤
        // NOT_CONSUME_YET：暂未消费
        // NOT_ONLINE：客户端不在线
        // UNKNOWN：其他问题
        // 
        [NameInMap("track_type")]
        [Validation(Required=true)]
        public string TrackType { get; set; }

    }

}
