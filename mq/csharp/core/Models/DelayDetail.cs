// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 延迟详情
    public class DelayDetail : TeaModel {
        // 延迟时间
        [NameInMap("delay_time")]
        [Validation(Required=false)]
        public string DelayTime { get; set; }

        // store拉取延迟时间
        [NameInMap("store_pull_delay")]
        [Validation(Required=false)]
        public string StorePullDelay { get; set; }

        // 延迟时间
        [NameInMap("light_write_delay")]
        [Validation(Required=false)]
        public string LightWriteDelay { get; set; }

        // 积压数量
        [NameInMap("backlog")]
        [Validation(Required=false)]
        public long? Backlog { get; set; }

    }

}
