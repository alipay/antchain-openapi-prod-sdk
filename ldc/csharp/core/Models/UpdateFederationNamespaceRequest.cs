// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateFederationNamespaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // fed namespace labels
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // Fed Namespace name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // workspace group name
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

    }

}
