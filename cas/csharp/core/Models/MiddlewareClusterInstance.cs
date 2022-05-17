// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 中间件集群实例
    public class MiddlewareClusterInstance : TeaModel {
        // cluster_id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // cluster_name
        [NameInMap("cluster_name")]
        [Validation(Required=true)]
        public string ClusterName { get; set; }

        // region_ids
        [NameInMap("region_ids")]
        [Validation(Required=true)]
        public List<string> RegionIds { get; set; }

        // zone_ids
        [NameInMap("zone_ids")]
        [Validation(Required=false)]
        public List<string> ZoneIds { get; set; }

        // acvip_endpoint
        [NameInMap("acvip_endpoint")]
        [Validation(Required=true)]
        public string AcvipEndpoint { get; set; }

        // instance_id
        [NameInMap("instance_id")]
        [Validation(Required=false)]
        public string InstanceId { get; set; }

        // workspace_group_name
        [NameInMap("workspace_group_name")]
        [Validation(Required=false)]
        public string WorkspaceGroupName { get; set; }

    }

}
