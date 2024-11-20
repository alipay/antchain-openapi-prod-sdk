// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRdaasTaxRpadecisionindicatorRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 决策服务id
        [NameInMap("service_id")]
        [Validation(Required=true)]
        public string ServiceId { get; set; }

        // 决策属性名称，目前一种属性: 比重-weight
        [NameInMap("property_name")]
        [Validation(Required=false)]
        public string PropertyName { get; set; }

        // 决策租户
        [NameInMap("decision_tenant")]
        [Validation(Required=false)]
        public string DecisionTenant { get; set; }

    }

}
