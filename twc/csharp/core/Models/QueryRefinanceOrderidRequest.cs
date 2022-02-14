// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    public class QueryRefinanceOrderidRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        [NameInMap("product_instance_id")]
        [Validation(Required=false)]
        public string ProductInstanceId { get; set; }

        // 资产包id
        [NameInMap("package_id")]
        [Validation(Required=true)]
        public string PackageId { get; set; }

        // 从第0页开始
        [NameInMap("page")]
        [Validation(Required=true)]
        public long? Page { get; set; }

        // 每次max最多查询的个数
        [NameInMap("page_size")]
        [Validation(Required=true)]
        public long? PageSize { get; set; }

    }

}
