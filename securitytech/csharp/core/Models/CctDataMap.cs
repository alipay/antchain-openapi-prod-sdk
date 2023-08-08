// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SECURITYTECH.Models
{
    // 内容安全请求体datamap
    public class CctDataMap : TeaModel {
        // text
        [NameInMap("text")]
        [Validation(Required=false)]
        public List<string> Text { get; set; }

        // PICTURE
        [NameInMap("picture")]
        [Validation(Required=false)]
        public List<string> Picture { get; set; }

    }

}
