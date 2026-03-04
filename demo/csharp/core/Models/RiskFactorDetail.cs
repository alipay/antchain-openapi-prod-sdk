// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DEMO.Models
{
    // 风险评估因子明细
    public class RiskFactorDetail : TeaModel {
        // 风险评估因子类型
        [NameInMap("factor_type")]
        [Validation(Required=false)]
        public string FactorType { get; set; }

        // 分数
        [NameInMap("score")]
        [Validation(Required=false)]
        public long? Score { get; set; }

        // 风险事件
        [NameInMap("evidence")]
        [Validation(Required=false)]
        public List<string> Evidence { get; set; }

    }

}
