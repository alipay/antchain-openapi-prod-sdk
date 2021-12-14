// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.NOTIFICATION.Models
{
    public class ImportEventMetadataRequest : TeaModel {
        // OAuth模式下的授权token
        [NameInMap("auth_token")]
        [Validation(Required=false)]
        public string AuthToken { get; set; }

        // 元数据文本
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

    }

}
