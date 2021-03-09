// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 地域信息
    public class Region : TeaModel {
        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // instanceStatus: AVAILABLE  UNAVAILABLE  RETIRED  DELETED
        [NameInMap("instancestatus")]
        [Validation(Required=true)]
        public string Instancestatus { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // properties
        [NameInMap("properties")]
        [Validation(Required=false)]
        public List<Property> Properties { get; set; }

    }

}
