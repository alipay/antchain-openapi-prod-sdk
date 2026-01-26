// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AICLAIM.Models
{
    // Extraction
    public class Extraction : TeaModel {
        // 提取出的具体信息的基类，不同类型的影像材料，有不同的数据结构，下文会详细展开。不同的sub_type映射不同的BaseExtractionData子类。
        [NameInMap("data")]
        [Validation(Required=false)]
        public BaseExtractionData Data { get; set; }

        // 失败原因(失败时填写)，成功时为null
        [NameInMap("failure_reason")]
        [Validation(Required=false)]
        public string FailureReason { get; set; }

        // 提取状态: success/not_supported
        [NameInMap("status")]
        [Validation(Required=false)]
        public string Status { get; set; }

    }

}
