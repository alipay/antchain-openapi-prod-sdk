// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.HK_SECURITYTECH.Models
{
    // 设备风险查询data
    public class DeviceRiskResp : TeaModel {
        // apdid
        [NameInMap("apdid")]
        [Validation(Required=true)]
        public string Apdid { get; set; }

        // apdid
        [NameInMap("apdid_token")]
        [Validation(Required=true)]
        public string ApdidToken { get; set; }

        // riskLevel
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public long? RiskLevel { get; set; }

        // risk_desc
        [NameInMap("risk_desc")]
        [Validation(Required=true)]
        public string RiskDesc { get; set; }

        // sug_action
        [NameInMap("sug_action")]
        [Validation(Required=true)]
        public string SugAction { get; set; }

        // risk_labels
        [NameInMap("risk_labels")]
        [Validation(Required=true)]
        public List<string> RiskLabels { get; set; }

    }

}
