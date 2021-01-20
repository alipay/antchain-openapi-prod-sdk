// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    public class UpdateServiceSlbmountRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 权重
        [NameInMap("mount_info")]
        [Validation(Required=false)]
        public List<Pair> MountInfo { get; set; }

        // region_identity
        [NameInMap("region_identity")]
        [Validation(Required=false)]
        public string RegionIdentity { get; set; }

        // service_id
        [NameInMap("service_id")]
        [Validation(Required=false)]
        public string ServiceId { get; set; }

        // slb_id
        [NameInMap("slb_id")]
        [Validation(Required=false)]
        public string SlbId { get; set; }

        // workspace
        [NameInMap("workspace")]
        [Validation(Required=false)]
        public string Workspace { get; set; }

    }

}
