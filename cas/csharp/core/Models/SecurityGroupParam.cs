// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // SecurityGroupParam
    public class SecurityGroupParam : TeaModel {
        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // region id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // security_group_name
        [NameInMap("security_group_name")]
        [Validation(Required=false)]
        public string SecurityGroupName { get; set; }

        // vpc_id
        [NameInMap("vpc_id")]
        [Validation(Required=false)]
        public string VpcId { get; set; }

    }

}
