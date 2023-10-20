// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 风险咨询结果
    public class ResultList : TeaModel {
        // 结果列表
        [NameInMap("risk_results")]
        [Validation(Required=true)]
        public List<RiskResult> RiskResults { get; set; }

        // 入参列表，数组
        [NameInMap("biz_params")]
        [Validation(Required=true)]
        public List<BizParam> BizParams { get; set; }

    }

}
