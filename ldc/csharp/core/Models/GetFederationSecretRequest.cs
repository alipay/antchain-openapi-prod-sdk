// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class GetFederationSecretRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // FedSecretname
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 所属命名空间名称。
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // workspaceGroup 名称
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

    }

}
