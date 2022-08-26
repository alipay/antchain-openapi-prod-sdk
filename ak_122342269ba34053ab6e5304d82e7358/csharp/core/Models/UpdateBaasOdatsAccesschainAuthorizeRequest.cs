// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ak_122342269ba34053ab6e5304d82e7358.Models
{
    public class UpdateBaasOdatsAccesschainAuthorizeRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 授权关系id
        [NameInMap("acl_id")]
        [Validation(Required=true)]
        public string AclId { get; set; }

        // 详细描述
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // 授权资源类型
        [NameInMap("resource_type")]
        [Validation(Required=true)]
        public string ResourceType { get; set; }

    }

}
