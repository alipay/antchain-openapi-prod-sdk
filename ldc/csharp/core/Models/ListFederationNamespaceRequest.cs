// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class ListFederationNamespaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // k8s resource label selector
        [NameInMap("label_selector")]
        [Validation(Required=false)]
        public string LabelSelector { get; set; }

        // workspace group名称
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

    }

}
