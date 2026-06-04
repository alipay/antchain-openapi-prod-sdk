// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS_SECURITY.Models
{
    // 大安全结构体
    public class ContentAddress : TeaModel {
        // 123
        [NameInMap("is_django_url")]
        [Validation(Required=false)]
        public bool? IsDjangoUrl { get; set; }

        // 213
        [NameInMap("address")]
        [Validation(Required=false)]
        public string Address { get; set; }

        // 123
        [NameInMap("http_url")]
        [Validation(Required=false)]
        public string HttpUrl { get; set; }

        // 123
        [NameInMap("audio_type")]
        [Validation(Required=false)]
        public string AudioType { get; set; }

    }

}
