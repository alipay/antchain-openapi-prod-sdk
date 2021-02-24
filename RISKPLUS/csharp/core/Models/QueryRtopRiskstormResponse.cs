// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRtopRiskstormResponse : TeaModel {
        [NameInMap("req_msg_id")]
        [Validation(Required=false)]
        public string ReqMsgId { get; set; }

        [NameInMap("result_code")]
        [Validation(Required=false)]
        public string ResultCode { get; set; }

        [NameInMap("result_msg")]
        [Validation(Required=false)]
        public string ResultMsg { get; set; }

        // 年报数据
        [NameInMap("annual_reports")]
        [Validation(Required=false)]
        public List<RtopRiskStormCompanyAnnualReport> AnnualReports { get; set; }

        // 风险标签数据
        [NameInMap("risk_labels")]
        [Validation(Required=false)]
        public List<RiskStormLabelResp> RiskLabels { get; set; }

    }

}
