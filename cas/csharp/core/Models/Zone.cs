// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 机房信息
    public class Zone : TeaModel {
        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // instanceStatus: AVAILABLE  UNAVAILABLE  RETIRED  DELETED
        [NameInMap("instancestatus")]
        [Validation(Required=true)]
        public string Instancestatus { get; set; }

        // region name
        [NameInMap("region")]
        [Validation(Required=true)]
        public string Region { get; set; }

        // properties
        [NameInMap("properties")]
        [Validation(Required=true)]
        public List<Property> Properties { get; set; }

    }

}
