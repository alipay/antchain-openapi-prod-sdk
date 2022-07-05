// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RISKPLUS.Models
{
    public class QueryDubbridgeAccountStatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 客户编号（资产方用户唯一标记二选一）
        [NameInMap("custom_no")]
        [Validation(Required=false)]
        public string CustomNo { get; set; }

        // 资产方用户唯一标识（资产方用户唯一标记二选一）
        [NameInMap("open_id")]
        [Validation(Required=false)]
        public string OpenId { get; set; }

    }

}
