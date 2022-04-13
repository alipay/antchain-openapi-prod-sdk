// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateFederationSecretRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // cell name list
        [NameInMap("cells")]
        [Validation(Required=true)]
        public List<string> Cells { get; set; }

        // FedSecret data
        // 
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<SecretData> Data { get; set; }

        // FedSecret labels
        // 
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // FedSecret name
        // 
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // Federation Secret namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // FedSecret Cluster Overrides
        // 
        [NameInMap("overrides")]
        [Validation(Required=false)]
        public FedSecretOverrideList Overrides { get; set; }

        // Fed Secret type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // workspace group 名称
        // 
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

    }

}
