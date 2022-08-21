// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 作品标签识别结果
    public class LabelRiskData : TeaModel {
        // 识别结果
        [NameInMap("code")]
        [Validation(Required=true)]
        public long? Code { get; set; }

        // 识别出的标签名称
        [NameInMap("label_name")]
        [Validation(Required=true)]
        public string LabelName { get; set; }

        // 识别出的标签是否与用户选择的标签匹配
        [NameInMap("is_risk")]
        [Validation(Required=true)]
        public bool? IsRisk { get; set; }

        // 识别出的标签匹配度百分比
        [NameInMap("similar_value")]
        [Validation(Required=true)]
        public string SimilarValue { get; set; }

        // 风险等级
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public long? RiskLevel { get; set; }

    }

}
