// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 单维度配额
    public class SingleDimGroup : TeaModel {
        // 维度标识, 如: WORKSPACE
        [NameInMap("dim_identity")]
        [Validation(Required=true)]
        public string DimIdentity { get; set; }

        // 维度实例的值, 如: 0000000001
        [NameInMap("dim_ins_value")]
        [Validation(Required=true)]
        public string DimInsValue { get; set; }

        // resource_identity
        [NameInMap("resource_identity")]
        [Validation(Required=true)]
        public string ResourceIdentity { get; set; }

        // 申请的数量，要注意quota_factor，比如当quota_factor=0.1时，申请实际为1的资源时，这里要填10
        [NameInMap("count")]
        [Validation(Required=true)]
        public long? Count { get; set; }

    }

}
