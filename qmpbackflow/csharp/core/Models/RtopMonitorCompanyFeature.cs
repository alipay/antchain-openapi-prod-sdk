// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    // 监测企业的特征信息
    public class RtopMonitorCompanyFeature : TeaModel {
        // 特征的描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 特征的名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 特征里的风险标签列表
        [NameInMap("risk_tags")]
        [Validation(Required=false)]
        public List<string> RiskTags { get; set; }

        // 特征的评分
        [NameInMap("score")]
        [Validation(Required=true)]
        public int? Score { get; set; }

    }

}
