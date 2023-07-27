// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class SyncTenantInfoRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 账号ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

    }

}
