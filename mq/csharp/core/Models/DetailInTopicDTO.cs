// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 各个 Topic 的消费情况
    public class DetailInTopicDTO : TeaModel {
        // 延迟时间
        [NameInMap("delay_time")]
        [Validation(Required=true)]
        public long? DelayTime { get; set; }

        // 最后更新时间
        [NameInMap("last_timestamp")]
        [Validation(Required=true)]
        public long? LastTimestamp { get; set; }

        // Topic 名称
        [NameInMap("topic")]
        [Validation(Required=true)]
        public string Topic { get; set; }

        // 该 Topic 消费总堆积数
        [NameInMap("total_diff")]
        [Validation(Required=true)]
        public long? TotalDiff { get; set; }

    }

}
