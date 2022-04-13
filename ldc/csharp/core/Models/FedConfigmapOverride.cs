// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed configmap override struct
    public class FedConfigmapOverride : TeaModel {
        // fed configmap data override
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<ConfigMapData> Data { get; set; }

        // cluster name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // name cell  override
        [NameInMap("name_override")]
        [Validation(Required=true)]
        public string NameOverride { get; set; }

    }

}
