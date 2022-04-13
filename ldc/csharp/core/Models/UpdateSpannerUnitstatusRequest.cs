// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    public class UpdateSpannerUnitstatusRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 工作空间组
        [NameInMap("workspace_group")]
        [Validation(Required=true)]
        public string WorkspaceGroup { get; set; }

        // 集群id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // 容器id列表
        [NameInMap("container_ids")]
        [Validation(Required=true)]
        public List<string> ContainerIds { get; set; }

        // 集群单元状态： 1-下线状态 2- 上线状态 3-删除状态
        [NameInMap("status")]
        [Validation(Required=true)]
        public long? Status { get; set; }

    }

}
