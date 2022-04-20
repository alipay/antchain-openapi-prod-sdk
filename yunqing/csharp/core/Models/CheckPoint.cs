// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.YUNQING.Models
{
    // 解决方案检查项
    public class CheckPoint : TeaModel {
        // 检查结果
        [NameInMap("check_result")]
        [Validation(Required=true)]
        public string CheckResult { get; set; }

        // 检查点, 例如参数检查
        [NameInMap("check_point")]
        [Validation(Required=true)]
        public string CheckPoint_ { get; set; }

        // 非法原因
        [NameInMap("invalid_reason")]
        [Validation(Required=false)]
        public string InvalidReason { get; set; }

    }

}
