// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.AITECHGUARD.Models
{
    public class QueryAicoguardAdbRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 查询向量库的内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 向量库的表名
        [NameInMap("collection_name")]
        [Validation(Required=true)]
        public string CollectionName { get; set; }

    }

}
