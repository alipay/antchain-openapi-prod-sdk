// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ATO.Models
{
    public class CancelWithholdPlanRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 当发现跨天继续提交
        [NameInMap("order_id")]
        [Validation(Required=true, MaxLength=50)]
        public string OrderId { get; set; }

        // 取消原因
        // RENTING_OUT:退租
        // RENTING_AND_RESALE:租转售
        // 
        // 
        [NameInMap("cancel_reason")]
        [Validation(Required=true, MaxLength=64)]
        public string CancelReason { get; set; }

    }

}
