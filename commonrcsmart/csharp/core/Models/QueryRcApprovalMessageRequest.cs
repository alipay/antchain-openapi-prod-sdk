// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMONRCSMART.Models
{
    public class QueryRcApprovalMessageRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 原审核请求ID
        [NameInMap("orig_request_id")]
        [Validation(Required=true)]
        public string OrigRequestId { get; set; }

    }

}
