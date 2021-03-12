// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BLOCKCHAIN.Models
{
    public class OpenDataauthorizationAuthorizationServiceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 集群ID
        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户ID
        [NameInMap("tenant_id")]
        [Validation(Required=true, MaxLength=50)]
        public string TenantId { get; set; }

        // 租户AK
        [NameInMap("tenant_access_key")]
        [Validation(Required=false)]
        public string TenantAccessKey { get; set; }

        // 开通原因
        [NameInMap("remark")]
        [Validation(Required=false, MaxLength=255)]
        public string Remark { get; set; }

    }

}
