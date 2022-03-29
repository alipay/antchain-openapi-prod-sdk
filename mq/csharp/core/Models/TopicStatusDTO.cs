// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // SofamqTopicStatus 返回data
    public class TopicStatusDTO : TeaModel {
        // Topic 的最后更新时间时间戳
        [NameInMap("last_timestamp")]
        [Validation(Required=true)]
        public long? LastTimestamp { get; set; }

        // 设置该 Topic 的读写模式。取值说明如下：6：同时支持读写；4：禁写；2：禁读。
        [NameInMap("perm")]
        [Validation(Required=true)]
        public long? Perm { get; set; }

        // 消息总量
        [NameInMap("total_count")]
        [Validation(Required=true)]
        public long? TotalCount { get; set; }

    }

}
