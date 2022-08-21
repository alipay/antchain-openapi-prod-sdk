// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 内容安全识别结果
    public class ContentRiskData : TeaModel {
        // 识别结果
        [NameInMap("code")]
        [Validation(Required=true)]
        public long? Code { get; set; }

        // 内容类型
        [NameInMap("content_type")]
        [Validation(Required=true)]
        public string ContentType { get; set; }

        // 风险名称
        [NameInMap("risk_name")]
        [Validation(Required=true)]
        public string RiskName { get; set; }

        // 风险等级
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public long? RiskLevel { get; set; }

        // 风险评分
        [NameInMap("risk_score")]
        [Validation(Required=true)]
        public long? RiskScore { get; set; }

    }

}
