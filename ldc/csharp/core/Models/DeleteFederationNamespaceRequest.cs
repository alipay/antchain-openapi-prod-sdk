// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class DeleteFederationNamespaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // fed namespace name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // workspaceGroup Name
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

    }

}
