// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS.Models
{
    public class CreateMeteringRuleRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 技术产品码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 商业产品码
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 方法匹配规则
        [NameInMap("method_matching_rules")]
        [Validation(Required=true)]
        public List<MethodMatchingRule> MethodMatchingRules { get; set; }

    }

}
