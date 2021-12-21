// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 内容安全信息
    public class SecurityData : TeaModel {
        // 内容安全检查结果
        [NameInMap("result")]
        [Validation(Required=true)]
        public string Result { get; set; }

        // 有风险的内容
        [NameInMap("risk_data")]
        [Validation(Required=false)]
        public List<string> RiskData { get; set; }

    }

}
