// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    public class StartBaasOdatsAccesschainAuthorizeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 详细描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 被授权链domain
        [NameInMap("grant_domain")]
        [Validation(Required=true)]
        public string GrantDomain { get; set; }

        // 授权链域名
        [NameInMap("owner_domain")]
        [Validation(Required=true)]
        public string OwnerDomain { get; set; }

        // 资源类型
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

    }

}
