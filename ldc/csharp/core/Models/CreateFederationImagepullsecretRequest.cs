// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateFederationImagepullsecretRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // cells
        [NameInMap("cells")]
        [Validation(Required=true)]
        public List<string> Cells { get; set; }

        // labels
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // image pull secret name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // image pull secret namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // fed image pull secret list
        [NameInMap("overrides")]
        [Validation(Required=true)]
        public FedImagePullSecretOverrideList Overrides { get; set; }

        // registry account
        [NameInMap("registry_account")]
        [Validation(Required=true)]
        public RegistryAccout RegistryAccount { get; set; }

        // workspace group name
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

    }

}
