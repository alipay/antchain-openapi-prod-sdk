// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 类目信息
    public class Catalog : TeaModel {
        // 类目id
        [NameInMap("catalog_id")]
        [Validation(Required=true)]
        public long? CatalogId { get; set; }

        // 类目名称
        [NameInMap("catalog_name")]
        [Validation(Required=true)]
        public string CatalogName { get; set; }

    }

}
