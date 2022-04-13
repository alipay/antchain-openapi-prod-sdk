// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // fed image pull secret list
    public class FedImagePullSecretOverrideList : TeaModel {
        // fed image pull secret overrides
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<FedImagePullSecretOverride> List { get; set; }

    }

}
