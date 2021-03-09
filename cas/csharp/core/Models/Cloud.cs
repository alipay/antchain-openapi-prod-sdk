// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // Cloud
    public class Cloud : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=false)]
        public long? Id { get; set; }

        // identity
        [NameInMap("identity")]
        [Validation(Required=false)]
        public string Identity { get; set; }

        // name
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // platforms
        [NameInMap("platforms")]
        [Validation(Required=false)]
        public List<CloudPlatform> Platforms { get; set; }

    }

}
