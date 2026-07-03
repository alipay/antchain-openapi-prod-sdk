// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryRdaasTaxSimpleauthdecisionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 决策租户
        [NameInMap("decision_tenant")]
        [Validation(Required=true)]
        public string DecisionTenant { get; set; }

        // 授权类型
        [NameInMap("auth_type")]
        [Validation(Required=true)]
        public string AuthType { get; set; }

        // 省份
        [NameInMap("province_code")]
        [Validation(Required=true)]
        public string ProvinceCode { get; set; }

    }

}
