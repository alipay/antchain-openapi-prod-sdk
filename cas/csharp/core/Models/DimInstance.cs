// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.CAS.Models
{
    // 单个维度实例，例如WORKSPACE_A
    public class DimInstance : TeaModel {
        // ID字段，实际不会使用，只是数据库中的索引
        [NameInMap("dim_id")]
        [Validation(Required=true)]
        public string DimId { get; set; }

        // dim_identity
        [NameInMap("dim_identity")]
        [Validation(Required=true)]
        public string DimIdentity { get; set; }

        // value
        [NameInMap("value")]
        [Validation(Required=true)]
        public string Value { get; set; }

        // description
        [NameInMap("description")]
        [Validation(Required=false)]
        public string Description { get; set; }

    }

}
