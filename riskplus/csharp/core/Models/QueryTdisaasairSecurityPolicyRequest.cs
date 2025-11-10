// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryTdisaasairSecurityPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 风控事件咨询查询入参
        [NameInMap("event_info")]
        [Validation(Required=true)]
        public EventInfo EventInfo { get; set; }

        // 请求处理方式
        // 
        [NameInMap("risk_type")]
        [Validation(Required=true)]
        public string RiskType { get; set; }

    }

}
