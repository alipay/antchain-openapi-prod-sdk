// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 维度组合实例，类似表示WORKSPACE_A下的APP_B
    public class DimInstanceGroup : TeaModel {
        // dim_group_id
        [NameInMap("dim_group_id")]
        [Validation(Required=true)]
        public string DimGroupId { get; set; }

        // dim_instances
        [NameInMap("dim_instances")]
        [Validation(Required=true)]
        public List<DimInstance> DimInstances { get; set; }

    }

}
