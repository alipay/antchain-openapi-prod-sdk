// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    public class ListResourceComputertypeRequest : TeaModel {
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // region name
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // zone name
        [NameInMap("zone")]
        [Validation(Required=false)]
        public string Zone { get; set; }

        // 实例规格族
        [NameInMap("instance_type_family")]
        [Validation(Required=true)]
        public string InstanceTypeFamily { get; set; }

    }

}
