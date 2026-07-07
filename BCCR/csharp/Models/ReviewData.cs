// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 审查数据
    public class ReviewData : TeaModel {
        // 作品名称安全识别结果
        [NameInMap("title_risk_data")]
        [Validation(Required=false)]
        public List<ContentRiskData> TitleRiskData { get; set; }

        // 内容安全识别结果
        [NameInMap("content_risk_data")]
        [Validation(Required=false)]
        public List<ContentRiskData> ContentRiskData { get; set; }

        // 作品相似识别结果
        [NameInMap("resemble_risk_data")]
        [Validation(Required=false)]
        public List<ResembleRiskData> ResembleRiskData { get; set; }

        // 作品标签识别结果
        [NameInMap("label_risk_data")]
        [Validation(Required=false)]
        public List<LabelRiskData> LabelRiskData { get; set; }

    }

}
