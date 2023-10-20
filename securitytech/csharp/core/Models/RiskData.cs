// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 风险数据
    public class RiskData : TeaModel {
        // 模型/标签编号
        [NameInMap("result_key")]
        [Validation(Required=true)]
        public string ResultKey { get; set; }

        // 模型分/标签值
        [NameInMap("result_value")]
        [Validation(Required=true)]
        public string ResultValue { get; set; }

    }

}
