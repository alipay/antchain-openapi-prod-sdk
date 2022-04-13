// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed image pull secret 
    public class FedImagePullSecret : TeaModel {
        // annotations
        [NameInMap("annotations")]
        [Validation(Required=false)]
        public List<string> Annotations { get; set; }

        // image pull secret registry account info
        [NameInMap("data")]
        [Validation(Required=true)]
        public RegistryAccout Data { get; set; }

        // labels
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<string> Labels { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // namesapce
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // cell overrides
        [NameInMap("overrides")]
        [Validation(Required=true)]
        public FedImagePullSecretOverrideList Overrides { get; set; }

        // workspace group name
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

        // cell list
        [NameInMap("cells")]
        [Validation(Required=true)]
        public List<string> Cells { get; set; }

    }

}
