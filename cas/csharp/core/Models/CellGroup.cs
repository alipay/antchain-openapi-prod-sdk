// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // CellGroup
    public class CellGroup : TeaModel {
        // identity
        [NameInMap("identity")]
        [Validation(Required=true)]
        public string Identity { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

        // properties
        [NameInMap("properties")]
        [Validation(Required=false)]
        public List<Property> Properties { get; set; }

        // instancestatus
        [NameInMap("instancestatus")]
        [Validation(Required=true)]
        public string Instancestatus { get; set; }

    }

}
