// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed configmap override list
    public class FedSecretOverrideList : TeaModel {
        // fed configmap override list
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<FedSecretOverride> List { get; set; }

    }

}
