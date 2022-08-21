// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 审查结果
    public class ReviewData : TeaModel {
        // 内容安全识别结果
        [NameInMap("content_risk_data")]
        [Validation(Required=true)]
        public List<ContentRiskData> ContentRiskData { get; set; }

        // 作品相似识别结果
        [NameInMap("resemble_risk_data")]
        [Validation(Required=true)]
        public List<ResembleRiskData> ResembleRiskData { get; set; }

        // 作品标签识别结果
        [NameInMap("label_risk_data")]
        [Validation(Required=true)]
        public List<LabelRiskData> LabelRiskData { get; set; }

    }

}
