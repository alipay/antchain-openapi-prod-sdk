// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class ResumeDataauthorizationAuthorizationRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 权限凭证
        [NameInMap("authority_cert")]
        [Validation(Required=true)]
        public string AuthorityCert { get; set; }

        // 操作人ID
        [NameInMap("operator_id")]
        [Validation(Required=true)]
        public string OperatorId { get; set; }

    }

}
