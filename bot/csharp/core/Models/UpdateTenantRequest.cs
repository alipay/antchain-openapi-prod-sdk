// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BOT.Models
{
    public class UpdateTenantRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 主键Id
        [NameInMap("id")]
        [Validation(Required=true)]
        public long? Id { get; set; }

        // 租户
        [NameInMap("tenant_name")]
        [Validation(Required=false)]
        public string TenantName { get; set; }

        // 组织名称
        [NameInMap("org_name")]
        [Validation(Required=false)]
        public string OrgName { get; set; }

        // 企业执照号
        // 
        [NameInMap("owner")]
        [Validation(Required=false)]
        public string Owner { get; set; }

        // 网关私钥
        // 
        [NameInMap("gateway_private_key")]
        [Validation(Required=false)]
        public string GatewayPrivateKey { get; set; }

        // 网关公钥
        // 
        [NameInMap("gateway_public_key")]
        [Validation(Required=false)]
        public string GatewayPublicKey { get; set; }

    }

}
