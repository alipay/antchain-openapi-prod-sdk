// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QuerySecurityPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 风险类型：表示风险处理或风险咨询——process/advice
        [NameInMap("risk_type")]
        [Validation(Required=false)]
        public string RiskType { get; set; }

        // 风险场景信息
        [NameInMap("security_scene")]
        [Validation(Required=false)]
        public SecurityScene SecurityScene { get; set; }

        // 服务上下文
        [NameInMap("service_context")]
        [Validation(Required=false)]
        public ServiceContext ServiceContext { get; set; }

        // 事件业务属性
        [NameInMap("event_info")]
        [Validation(Required=true)]
        public string EventInfo { get; set; }

    }

}
