// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateFederationNamespaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // k8s resource labels
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // FedNamespace名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // workspaceGroup名称
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

        // annotation,可以用来存放description等其他字段
        [NameInMap("annotations")]
        [Validation(Required=false)]
        public List<Annotation> Annotations { get; set; }

    }

}
