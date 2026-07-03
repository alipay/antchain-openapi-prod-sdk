// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRpSecurityPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 风险类型：表示风险处理或风险咨询——process/advice
        [NameInMap("risk_type")]
        [Validation(Required=true)]
        public string RiskType { get; set; }

        // security_scene
        [NameInMap("security_scene")]
        [Validation(Required=true)]
        public SecurityScene SecurityScene { get; set; }

        // service_context
        [NameInMap("service_context")]
        [Validation(Required=true)]
        public ServiceContext ServiceContext { get; set; }

    }

}
