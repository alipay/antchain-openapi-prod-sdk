// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INS_RISK.Models
{
    public class QuerySecurityPolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // l1_domain_code
        [NameInMap("l1_domain_code")]
        [Validation(Required=true)]
        public string L1DomainCode { get; set; }

        // l2_domain_code
        [NameInMap("l2_domain_code")]
        [Validation(Required=true)]
        public string L2DomainCode { get; set; }

        // 请求流水号
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 业务code
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // expectProductCodes
        [NameInMap("expect_product_codes")]
        [Validation(Required=false)]
        public List<string> ExpectProductCodes { get; set; }

        // 参数
        [NameInMap("params")]
        [Validation(Required=false)]
        public string Params { get; set; }

    }

}
