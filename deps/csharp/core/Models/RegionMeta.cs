// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Deps.Models
{
    // region info
    public class RegionMeta : TeaModel {
        // region支持的网络类型
        [NameInMap("available_network_types")]
        [Validation(Required=false)]
        public List<string> AvailableNetworkTypes { get; set; }

        // region display name
        [NameInMap("display_name")]
        [Validation(Required=false)]
        public string DisplayName { get; set; }

        // region identity
        [NameInMap("id")]
        [Validation(Required=false)]
        public string Id { get; set; }

        // region paas id
        [NameInMap("paas_id")]
        [Validation(Required=false)]
        public string PaasId { get; set; }

        // region iaas id
        [NameInMap("region_iaas_id")]
        [Validation(Required=false)]
        public string RegionIaasId { get; set; }

        // region包含的所有zone id列表
        [NameInMap("zone_ids")]
        [Validation(Required=false)]
        public List<string> ZoneIds { get; set; }

        // region state.
        [NameInMap("state")]
        [Validation(Required=false)]
        public string State { get; set; }

    }

}
