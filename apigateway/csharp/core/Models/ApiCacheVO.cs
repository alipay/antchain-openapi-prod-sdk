// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.APIGATEWAY.Models
{
    // ApiCacheVO
    public class ApiCacheVO : TeaModel {
        // 是否需要缓存
        [NameInMap("need_cache")]
        [Validation(Required=false)]
        public bool? NeedCache { get; set; }

        // TTL
        [NameInMap("ttl")]
        [Validation(Required=false)]
        public long? Ttl { get; set; }

        // cacheKeys
        [NameInMap("cache_keys")]
        [Validation(Required=false)]
        public List<ApiCacheKeyVO> CacheKeys { get; set; }

    }

}
