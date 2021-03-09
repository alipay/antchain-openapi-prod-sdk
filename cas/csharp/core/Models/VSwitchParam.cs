// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // VSwitchParam
    public class VSwitchParam : TeaModel {
        // cidr_block
        [NameInMap("cidr_block")]
        [Validation(Required=false)]
        public string CidrBlock { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // vpc_id
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

        // vswitch_name
        [NameInMap("vswitch_name")]
        [Validation(Required=false)]
        public string VswitchName { get; set; }

        // zone_id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

    }

}
