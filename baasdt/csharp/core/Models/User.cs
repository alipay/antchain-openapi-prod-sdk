// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 用户
    public class User : TeaModel {
        // 用户分布式身份ID
        [NameInMap("did")]
        [Validation(Required=true)]
        public string Did { get; set; }

        // 用户的链外身份ID
        [NameInMap("local_id")]
        [Validation(Required=true)]
        public string LocalId { get; set; }

        // 用户公钥
        [NameInMap("pk")]
        [Validation(Required=true)]
        public string Pk { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 用户ID
        [NameInMap("user_id")]
        [Validation(Required=true)]
        public string UserId { get; set; }

        // 用户VC
        [NameInMap("vc")]
        [Validation(Required=true)]
        public string Vc { get; set; }

    }

}
