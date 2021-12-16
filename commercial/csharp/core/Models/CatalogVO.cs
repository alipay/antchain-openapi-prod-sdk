// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.COMMERCIAL.Models
{
    // 类目VO
    public class CatalogVO : TeaModel {
        // 类目Id
        [NameInMap("catalog_id")]
        [Validation(Required=true)]
        public long? CatalogId { get; set; }

        // 类目名称
        [NameInMap("catalog_name")]
        [Validation(Required=true)]
        public string CatalogName { get; set; }

        // 子类目列表
        [NameInMap("child_catalogs")]
        [Validation(Required=true)]
        public List<Catalog> ChildCatalogs { get; set; }

    }

}
