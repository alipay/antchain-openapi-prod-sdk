// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeReceiptStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // open_id
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

        // 客户号
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

    }

}
