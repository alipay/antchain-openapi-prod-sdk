// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    public class CreateSofamqNamespaceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // instance id
        [NameInMap("instance_id")]
        [Validation(Required=true)]
        public string InstanceId { get; set; }

        // instance_type
        [NameInMap("instance_type")]
        [Validation(Required=false)]
        public string InstanceType { get; set; }

        // nsid
        [NameInMap("namespace_id")]
        [Validation(Required=true)]
        public string NamespaceId { get; set; }

        // namespace_name
        [NameInMap("namespace_name")]
        [Validation(Required=true)]
        public string NamespaceName { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

        // workspace_group
        [NameInMap("workspace_group")]
        [Validation(Required=false)]
        public string WorkspaceGroup { get; set; }

        // ldcMode
        [NameInMap("ldc_mode")]
        [Validation(Required=true)]
        public long? LdcMode { get; set; }

    }

}
