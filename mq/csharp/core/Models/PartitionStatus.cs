// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 分区状态
    public class PartitionStatus : TeaModel {
        // 分区ID
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // 消费位点
        [NameInMap("consume_offset")]
        [Validation(Required=false)]
        public long? ConsumeOffset { get; set; }

        // 延迟时间
        [NameInMap("consume_time")]
        [Validation(Required=false)]
        public string ConsumeTime { get; set; }

        // 积压数量
        [NameInMap("backlog_num")]
        [Validation(Required=false)]
        public long? BacklogNum { get; set; }

    }

}
