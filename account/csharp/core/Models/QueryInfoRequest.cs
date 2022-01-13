// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACCOUNT.Models
{
    public class QueryInfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 调用系统名称
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // 主体信息，不填默认ZL6
        [NameInMap("ou")]
        [Validation(Required=false)]
        public string Ou { get; set; }

    }

}
