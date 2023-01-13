// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 导出任务检查点信息
    public class TriggerCheckpoint : TeaModel {
        // 当前处理的高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public long? Height { get; set; }

        // 检查点偏移量
        [NameInMap("index")]
        [Validation(Required=false)]
        public long? Index { get; set; }

        // 检查点的类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 最近的错误信息
        [NameInMap("last_error")]
        [Validation(Required=false)]
        public string LastError { get; set; }

        // 错误计数
        [NameInMap("error_count")]
        [Validation(Required=false)]
        public long? ErrorCount { get; set; }

        // 推送的事件数量
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public long? TotalCount { get; set; }

    }

}
