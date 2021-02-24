// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class GetRtopCompanyDetailResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 风险维度特征
        [NameInMap("risk_features")]
        [Validation(Required=false)]
        public string RiskFeatures { get; set; }

        // 风险分数
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public long? RiskScore { get; set; }

        // 风险标签列表
        [NameInMap("risk_tags")]
        [Validation(Required=false)]
        public List<RtopRiskTag> RiskTags { get; set; }

    }

}
