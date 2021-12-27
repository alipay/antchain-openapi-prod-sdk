// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 涉众风险企业特征
    public class RtopCrowdRiskFeatureResp : TeaModel {
        // 特征标签列表
        [NameInMap("clue_tags")]
        [Validation(Required=false)]
        public List<RtopCrowdRiskFeatureTag> ClueTags { get; set; }

        // 特征名称
        [NameInMap("feature_name")]
        [Validation(Required=true)]
        public string FeatureName { get; set; }

        // 特征​分数
        [NameInMap("score")]
        [Validation(Required=true)]
        public int? Score { get; set; }

    }

}
