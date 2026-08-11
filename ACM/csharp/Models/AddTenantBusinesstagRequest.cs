// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class AddTenantBusinesstagRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 业务场景码
        [NameInMap("business_code")]
        [Validation(Required=true)]
        public string BusinessCode { get; set; }

        // 业务场景的权限码，区分大小写
        [NameInMap("auth_code")]
        [Validation(Required=true)]
        public string AuthCode { get; set; }

    }

}
