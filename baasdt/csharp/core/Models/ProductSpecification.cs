// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 商品规格
    public class ProductSpecification : TeaModel {
        // 规格名称
        [NameInMap("specification_name")]
        [Validation(Required=true)]
        public string SpecificationName { get; set; }

        // 规格值
        [NameInMap("specification_value")]
        [Validation(Required=true)]
        public string SpecificationValue { get; set; }

    }

}
