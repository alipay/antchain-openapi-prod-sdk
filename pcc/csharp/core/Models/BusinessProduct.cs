// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PCC.Models
{
    // L3
    public class BusinessProduct : TeaModel {
        // 业务产品code
        [NameInMap("code")]
        [Validation(Required=true)]
        public string Code { get; set; }

        // 产品线名称
        [NameInMap("name")]
        [Validation(Required=true)]
        public string Name { get; set; }

        // 归属业务线
        [NameInMap("business_line")]
        [Validation(Required=true)]
        public string BusinessLine { get; set; }

        // 归属产品线
        [NameInMap("product_line")]
        [Validation(Required=true)]
        public string ProductLine { get; set; }

        // spu列表
        [NameInMap("product_spu")]
        [Validation(Required=true)]
        public List<ProductSpu> ProductSpu { get; set; }

    }

}
