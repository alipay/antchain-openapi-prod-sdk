// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class ApplyTrustloginUrlRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 	跳转地址
        [NameInMap("goto_url")]
        [Validation(Required=true)]
        public string GotoUrl { get; set; }

        // 	操作员id
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

    }

}
