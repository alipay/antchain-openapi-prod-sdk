// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 反欺诈风险数据服务决策结果
    public class SecurityResultInfos : TeaModel {
        // 反欺诈风险数据服务风险建议决策
        [NameInMap("decision")]
        [Validation(Required=true)]
        public string Decision { get; set; }

        // 反欺诈风险数据服务风险分
        [NameInMap("risk_score")]
        [Validation(Required=true)]
        public long? RiskScore { get; set; }

        // 反欺诈风险数据服务场景码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

    }

}
