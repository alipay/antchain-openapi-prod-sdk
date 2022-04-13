// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class CreateFederationConfigmapRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // Cell name list
        [NameInMap("cells")]
        [Validation(Required=true)]
        public List<string> Cells { get; set; }

        // FedConfigMap data
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<ConfigMapData> Data { get; set; }

        // FedConfigMap labels
        [NameInMap("labels")]
        [Validation(Required=false)]
        public List<Label> Labels { get; set; }

        // FedConfigMap name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // Federation ConfigMap namespace
        [NameInMap("namespace")]
        [Validation(Required=true)]
        public string Namespace { get; set; }

        // FedCofigmap Cluster Overrides
        [NameInMap("overrides")]
        [Validation(Required=false)]
        public FedConfigMapOverrideList Overrides { get; set; }

        // workspace group 名称
        [NameInMap("workspace_group_name")]
        [Validation(Required=true)]
        public string WorkspaceGroupName { get; set; }

    }

}
