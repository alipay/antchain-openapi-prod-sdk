// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.Ldc.Models
{
    // FedConfigMapOverride 列表
    public class FedConfigMapOverrideList : TeaModel {
        // fed configmap override list
        [NameInMap("list")]
        [Validation(Required=true)]
        public List<FedConfigmapOverride> List { get; set; }

    }

}
