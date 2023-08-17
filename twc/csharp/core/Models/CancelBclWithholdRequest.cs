// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class CancelBclWithholdRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 解约申请单号
        [NameInMap("cancel_apply_no")]
        [Validation(Required=true)]
        public string CancelApplyNo { get; set; }

        // 是否允许解除代扣
        [NameInMap("allow_cancel_withhold")]
        [Validation(Required=true)]
        public bool? AllowCancelWithhold { get; set; }

    }

}
