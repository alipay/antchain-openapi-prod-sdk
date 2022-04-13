// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // cluster info
    public class ClusterInfo : TeaModel {
        // created time
        [NameInMap("created_time")]
        [Validation(Required=false, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string CreatedTime { get; set; }

        // env
        [NameInMap("env")]
        [Validation(Required=false)]
        public string Env { get; set; }

        // cluster is healthy or not
        [NameInMap("is_healthy")]
        [Validation(Required=true)]
        public bool? IsHealthy { get; set; }

        // cluster name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // cluster overview info
        [NameInMap("overview_info")]
        [Validation(Required=true)]
        public ClusterOverviewInfo OverviewInfo { get; set; }

        // region name
        [NameInMap("region_name")]
        [Validation(Required=false)]
        public string RegionName { get; set; }

        // 独占 or 共享
        [NameInMap("type")]
        [Validation(Required=false)]
        public string Type { get; set; }

        // version
        [NameInMap("version")]
        [Validation(Required=false)]
        public string Version { get; set; }

        // zone name
        [NameInMap("zone_name")]
        [Validation(Required=false)]
        public string ZoneName { get; set; }

        // workspace名称[如果存在]。
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
