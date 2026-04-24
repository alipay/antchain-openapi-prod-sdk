// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INS_RISK.Models
{
    public class QueryScorePolicyRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 请求流水号，保证唯一
        [NameInMap("request_id")]
        [Validation(Required=true)]
        public string RequestId { get; set; }

        // 业务编码
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 产品编码
        [NameInMap("expect_product_code")]
        [Validation(Required=true)]
        public string ExpectProductCode { get; set; }

        // 请求参数
        [NameInMap("params")]
        [Validation(Required=true)]
        public string Params { get; set; }

    }

}
