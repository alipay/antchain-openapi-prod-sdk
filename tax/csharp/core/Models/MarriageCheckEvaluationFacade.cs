// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 婚姻状况查验服务结果对象
    public class MarriageCheckEvaluationFacade : TeaModel {
        // 婚姻状况查验结果
        [NameInMap("check_result")]
        [Validation(Required=true)]
        public string CheckResult { get; set; }

    }

}
