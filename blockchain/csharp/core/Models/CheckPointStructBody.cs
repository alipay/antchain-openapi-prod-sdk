// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // 阿里云数据导出任务checkpoint类
    public class CheckPointStructBody : TeaModel {
        // 高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 序号
        [NameInMap("index")]
        [Validation(Required=false)]
        public string Index { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // last_error
        [NameInMap("last_error")]
        [Validation(Required=false)]
        public string LastError { get; set; }

        // 错误统计
        [NameInMap("error_count")]
        [Validation(Required=false)]
        public string ErrorCount { get; set; }

        // 统计
        [NameInMap("total_count")]
        [Validation(Required=false)]
        public string TotalCount { get; set; }

    }

}
