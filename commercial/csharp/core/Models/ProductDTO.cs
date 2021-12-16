// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 产品信息扩展
    public class ProductDTO : TeaModel {
        // 产品信息
        [NameInMap("product_code")]
        [Validation(Required=true)]
        public string ProductCode { get; set; }

        // 产品名称
        [NameInMap("product_name")]
        [Validation(Required=true)]
        public string ProductName { get; set; }

        // 产品oxm类型
        [NameInMap("oxm_type")]
        [Validation(Required=true)]
        public string OxmType { get; set; }

        // 产品一级类目
        [NameInMap("l1_catalog_id")]
        [Validation(Required=true)]
        public long? L1CatalogId { get; set; }

        // 产品二级类目
        [NameInMap("l2_catalog_id")]
        [Validation(Required=true)]
        public long? L2CatalogId { get; set; }

        // 产品描述
        [NameInMap("desc")]
        [Validation(Required=true)]
        public string Desc { get; set; }

    }

}
