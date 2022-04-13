// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // FedSecret cluster override
    public class FedSecretOverride : TeaModel {
        // fed secret data override
        [NameInMap("data")]
        [Validation(Required=true)]
        public List<SecretData> Data { get; set; }

        // cluster name
        // 
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // name cell override
        [NameInMap("name_override")]
        [Validation(Required=true)]
        public string NameOverride { get; set; }

    }

}
