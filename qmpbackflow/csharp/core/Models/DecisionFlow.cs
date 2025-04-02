// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 决策流
    public class DecisionFlow : TeaModel {
        // 输出参数
        [NameInMap("decision_flow")]
        [Validation(Required=false)]
        public OutParams DecisionFlow_ { get; set; }

        // 决策结果
        [NameInMap("decision")]
        [Validation(Required=true)]
        public string Decision { get; set; }

        // infocodes
        [NameInMap("info_codes")]
        [Validation(Required=false)]
        public InfoCodes InfoCodes { get; set; }

    }

}
