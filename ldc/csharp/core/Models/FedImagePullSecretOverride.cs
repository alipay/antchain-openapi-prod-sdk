// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed image pull Secret override
    public class FedImagePullSecretOverride : TeaModel {
        // override data
        [NameInMap("data")]
        [Validation(Required=true)]
        public RegistryAccout Data { get; set; }

        // cell name
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // cell name override
        [NameInMap("name_override")]
        [Validation(Required=true)]
        public string NameOverride { get; set; }

    }

}
