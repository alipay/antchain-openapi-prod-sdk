// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    // 模型结果详情
    public class RiskModel : TeaModel {
        // 风险场景编码
        [NameInMap("scene_code")]
        [Validation(Required=true)]
        public string SceneCode { get; set; }

        // 该风险场景的风险分值
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

        // 逾期率
        [NameInMap("delinquency_rate")]
        [Validation(Required=false)]
        public string DelinquencyRate { get; set; }

        // 风险建议
        [NameInMap("risk_advice")]
        [Validation(Required=false)]
        public string RiskAdvice { get; set; }

        // 风险等级
        [NameInMap("risk_rank")]
        [Validation(Required=false)]
        public string RiskRank { get; set; }

    }

}
