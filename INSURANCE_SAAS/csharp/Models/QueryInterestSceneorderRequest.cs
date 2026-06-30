// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.INSURANCE_SAAS.Models
{
    public class QueryInterestSceneorderRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 请求流水号
        [NameInMap("request_no")]
        [Validation(Required=true)]
        public string RequestNo { get; set; }

        // 我方权益申请流水号
        [NameInMap("interest_no")]
        [Validation(Required=true)]
        public string InterestNo { get; set; }

        // 产品编码
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

    }

}
