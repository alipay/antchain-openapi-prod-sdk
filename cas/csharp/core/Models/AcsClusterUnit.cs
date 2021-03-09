// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // AcsClusterUnit
    public class AcsClusterUnit : TeaModel {
        // cluster_id
        [NameInMap("cluster_id")]
        [Validation(Required=true)]
        public string ClusterId { get; set; }

        // address
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // unit_status
        [NameInMap("unit_status")]
        [Validation(Required=false)]
        public long? UnitStatus { get; set; }

        // create_time
        [NameInMap("create_time")]
        [Validation(Required=false)]
        public string CreateTime { get; set; }

        // modify_time
        [NameInMap("modify_time")]
        [Validation(Required=false)]
        public string ModifyTime { get; set; }

        // container_id
        [NameInMap("container_id")]
        [Validation(Required=false)]
        public string ContainerId { get; set; }

    }

}
