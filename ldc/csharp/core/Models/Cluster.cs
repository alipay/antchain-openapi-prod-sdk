// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // AKS集群cluster
    public class Cluster : TeaModel {
        // 集群创建时间
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // env
        [NameInMap("env")]
        [Validation(Required=true)]
        public string Env { get; set; }

        // 集群是否健康
        [NameInMap("is_healthy")]
        [Validation(Required=true)]
        public bool? IsHealthy { get; set; }

        // 集群名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // region name
        // 
        [NameInMap("region_name")]
        [Validation(Required=true)]
        public string RegionName { get; set; }

        // 独占
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // 集群版本
        [NameInMap("version")]
        [Validation(Required=true)]
        public string Version { get; set; }

        // 环境名称
        [NameInMap("workspace")]
        [Validation(Required=true)]
        public string Workspace { get; set; }

        // 机房名称
        [NameInMap("zone_name")]
        [Validation(Required=true)]
        public string ZoneName { get; set; }

    }

}
