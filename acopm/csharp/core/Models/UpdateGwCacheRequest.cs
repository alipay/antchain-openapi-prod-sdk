// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACOPM.Models
{
    public class UpdateGwCacheRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 刷新缓存的key
        [NameInMap("cache_key")]
        [Validation(Required=true)]
        public string CacheKey { get; set; }

    }

}
