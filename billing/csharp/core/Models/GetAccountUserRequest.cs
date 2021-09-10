// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BILLING.Models
{
    public class GetAccountUserRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // alipay托管子户ID
        [NameInMap("alipay_user_id")]
        [Validation(Required=true)]
        public string AlipayUserId { get; set; }

    }

}
