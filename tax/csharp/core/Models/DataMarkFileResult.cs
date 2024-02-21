// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TAX.Models
{
    // 要素授权打标返回结果
    public class DataMarkFileResult : TeaModel {
        // 返回数据再oss上的地址
        [NameInMap("file_url")]
        [Validation(Required=true)]
        public string FileUrl { get; set; }

        // 秘钥
        [NameInMap("secret")]
        [Validation(Required=true)]
        public string Secret { get; set; }

    }

}
