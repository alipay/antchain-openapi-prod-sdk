// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // ComputerParam
    public class ComputerParam : TeaModel {
        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // image_id
        [NameInMap("image_id")]
        [Validation(Required=false)]
        public string ImageId { get; set; }

        // instance_type
        [NameInMap("instance_type")]
        [Validation(Required=false)]
        public string InstanceType { get; set; }

        // region_id
        [NameInMap("region_id")]
        [Validation(Required=false)]
        public string RegionId { get; set; }

        // security_group_id
        [NameInMap("security_group_id")]
        [Validation(Required=false)]
        public string SecurityGroupId { get; set; }

        // instance_name
        [NameInMap("instance_name")]
        [Validation(Required=false)]
        public string InstanceName { get; set; }

        // zone_id
        [NameInMap("zone_id")]
        [Validation(Required=false)]
        public string ZoneId { get; set; }

    }

}
