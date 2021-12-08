// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    // TriggerLogDTO类成员
    public class PositionStructBody : TeaModel {
        // 错误计数
        [NameInMap("error_count")]
        [Validation(Required=false)]
        public string ErrorCount { get; set; }

        // 高度
        [NameInMap("height")]
        [Validation(Required=false)]
        public string Height { get; set; }

        // 序号
        [NameInMap("index")]
        [Validation(Required=false)]
        public string Index { get; set; }

        // 最后一个错误
        [NameInMap("last_error")]
        [Validation(Required=false)]
        public string LastError { get; set; }

        // 类型
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

    }

}
