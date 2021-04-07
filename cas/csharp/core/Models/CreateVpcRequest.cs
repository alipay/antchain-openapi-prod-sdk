// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class CreateVpcRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 专有网络网段
        [NameInMap("cidr_lock")]
        [Validation(Required=true)]
        public string CidrLock { get; set; }

        // 名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 工作空间
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

    }

}
