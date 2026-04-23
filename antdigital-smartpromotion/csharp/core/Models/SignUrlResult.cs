// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SMARTPROMOTION.Models
{
    // 签署链接结果
    public class SignUrlResult : TeaModel {
        // 签署（长）链接
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

        // 签署短链接
        [NameInMap("short_url")]
        [Validation(Required=false)]
        public string ShortUrl { get; set; }

        // 签署链接提示信息
        [NameInMap("sign_msg")]
        [Validation(Required=false)]
        public string SignMsg { get; set; }

    }

}
