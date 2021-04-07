// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateSecuritygroupPermissionRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // PermissionVO
        [NameInMap("permission")]
        [Validation(Required=true)]
        public PermissionVO Permission { get; set; }

        // securityGroupId
        [NameInMap("security_group_id")]
        [Validation(Required=true)]
        public string SecurityGroupId { get; set; }

    }

}
