// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 人脸盾结果
    public class FaceShieldResult : TeaModel {
        // 设备token
        [NameInMap("apdid_token")]
        [Validation(Required=true)]
        public string ApdidToken { get; set; }

        // 风险等级，-1参数异常，0无风险，1-3表示低、中、高
        [NameInMap("risk_level")]
        [Validation(Required=true)]
        public long? RiskLevel { get; set; }

        // 风险描述，对风险等级的补充
        [NameInMap("risk_desc")]
        [Validation(Required=true)]
        public string RiskDesc { get; set; }

        // 处理的建议，如PAAS
        [NameInMap("sug_action")]
        [Validation(Required=true)]
        public string SugAction { get; set; }

    }

}
