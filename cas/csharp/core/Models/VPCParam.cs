// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // VpcParam
    public class VPCParam : TeaModel {
        // cidr_block
        [NameInMap("cidr_block")]
        [Validation(Required=false)]
        public string CidrBlock { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // vpc_name
        [NameInMap("vpc_name")]
        [Validation(Required=false)]
        public string VpcName { get; set; }

    }

}
