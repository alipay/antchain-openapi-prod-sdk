// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryFlowRunRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 创建 Flow Run 时传入的业务订单号，必须唯一，用于定位本次执行。
        [NameInMap("client_order_no")]
        [Validation(Required=true)]
        public string ClientOrderNo { get; set; }

    }

}
