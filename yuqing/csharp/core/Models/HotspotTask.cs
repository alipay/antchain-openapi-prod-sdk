// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUQING.Models
{
    // 热搜任务结构体
    public class HotspotTask : TeaModel {
        // 任务ID
        [NameInMap("task_id")]
        [Validation(Required=true)]
        public string TaskId { get; set; }

        // 数量
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

        // 当前页
        [NameInMap("page_now")]
        [Validation(Required=true)]
        public long? PageNow { get; set; }

        // 每页数量
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

        // 数据
        [NameInMap("pages")]
        [Validation(Required=true)]
        public List<HotspotMessage> Pages { get; set; }

    }

}
