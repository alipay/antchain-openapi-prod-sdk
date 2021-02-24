// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 涉众风险企业特征
    public class RtopCrowdRiskFeatureTag : TeaModel {
        // 标签描述
        [NameInMap("tag_explanation")]
        [Validation(Required=true)]
        public string TagExplanation { get; set; }

        // 标签名称
        [NameInMap("tag_name")]
        [Validation(Required=true)]
        public string TagName { get; set; }

    }

}
