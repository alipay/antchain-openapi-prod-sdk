// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 实时状态统计
    public class ConsumerRunningDataDTO : TeaModel {
        // 堆积量
        [NameInMap("diff")]
        [Validation(Required=true)]
        public long? Diff { get; set; }

        // 每小时内消费失败的消息数统计
        [NameInMap("failed_count_per_hour")]
        [Validation(Required=true)]
        public long? FailedCountPerHour { get; set; }

        // 消费消息失败的 TPS 统计
        [NameInMap("failed_tps")]
        [Validation(Required=true)]
        public string FailedTps { get; set; }

        // 订阅方的 Group ID
        [NameInMap("group_id")]
        [Validation(Required=true)]
        public string GroupId { get; set; }

        // 消费消息成功的 TPS 统计
        [NameInMap("ok_tps")]
        [Validation(Required=true)]
        public string OkTps { get; set; }

        // 消费 RT 时间，单位 ms
        [NameInMap("rt")]
        [Validation(Required=true)]
        public string Rt { get; set; }

        // 订阅的 Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

    }

}
