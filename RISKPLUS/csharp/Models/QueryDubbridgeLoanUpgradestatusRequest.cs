// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeLoanUpgradestatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 用信申请订单号(资产方)
        [NameInMap("original_order_no")]
        [Validation(Required=false)]
        public string OriginalOrderNo { get; set; }

        // 借据编号
        [NameInMap("receipt_no")]
        [Validation(Required=false)]
        public string ReceiptNo { get; set; }

    }

}
