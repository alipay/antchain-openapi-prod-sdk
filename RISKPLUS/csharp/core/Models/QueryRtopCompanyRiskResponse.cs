// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopCompanyRiskResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 风险维度
        [NameInMap("risk_factors")]
        [Validation(Required=false)]
        public List<RtopCompanyRiskFactor> RiskFactors { get; set; }

        // 风险等级
        [NameInMap("risk_level")]
        [Validation(Required=false)]
        public string RiskLevel { get; set; }

        // 风险报文
        [NameInMap("risk_message")]
        [Validation(Required=false)]
        public string RiskMessage { get; set; }

        // 风险分数
        [NameInMap("risk_score")]
        [Validation(Required=false)]
        public long? RiskScore { get; set; }

        // 风险标签
        [NameInMap("risk_tags")]
        [Validation(Required=false)]
        public List<string> RiskTags { get; set; }

    }

}
