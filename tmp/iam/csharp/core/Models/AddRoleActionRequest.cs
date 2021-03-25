// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.IAM.Models
{
    public class AddRoleActionRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 角色ID
        [NameInMap("role_id")]
        [Validation(Required=true)]
        public string RoleId { get; set; }

        // 权限码
        [NameInMap("actions")]
        [Validation(Required=true)]
        public List<string> Actions { get; set; }

    }

}
