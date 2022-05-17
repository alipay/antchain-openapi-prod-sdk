// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class GetAppportraitAppRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 待查询的应用名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // TenantId
        [NameInMap("tenant_id")]
        [Validation(Required=false)]
        public string TenantId { get; set; }

        // TenantName
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

    }

}
