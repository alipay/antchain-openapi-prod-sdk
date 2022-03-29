// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 积压数据点
    public class BacklogMetricItem : TeaModel {
        // 积压消息量
        [NameInMap("backlog_cnt")]
        [Validation(Required=true)]
        public long? BacklogCnt { get; set; }

        // 积压数据的时间戳
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public long? Timestamp { get; set; }

    }

}
