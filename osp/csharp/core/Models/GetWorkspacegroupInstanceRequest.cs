// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Osp.Models
{
    public class GetWorkspacegroupInstanceRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 租户id 
        [NameInMap("tenant_id")]
        [Validation(Required=true)]
        public string TenantId { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=false)]
        public string ClusterId { get; set; }

        // 是否需要原始的instanceId
        [NameInMap("need_real")]
        [Validation(Required=false)]
        public bool? NeedReal { get; set; }

    }

}
