// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class DeleteTrustloginTokenRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 系统来源
        [NameInMap("source_system")]
        [Validation(Required=true)]
        public string SourceSystem { get; set; }

        // 免登凭证
        [NameInMap("access_token")]
        [Validation(Required=true)]
        public string AccessToken { get; set; }

    }

}
