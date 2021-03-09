// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Acm.Models
{
    public class GetTenantDingtokenRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 入驻金融云的产品码
        [NameInMap("product")]
        [Validation(Required=true)]
        public string Product { get; set; }

        // 租户唯一标识
        [NameInMap("tenant")]
        [Validation(Required=true)]
        public string Tenant { get; set; }

    }

}
