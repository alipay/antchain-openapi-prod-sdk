// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.RMS.Models
{
    // TokenConfig
    public class TokenConfig : TeaModel {
        // token
        [NameInMap("token")]
        [Validation(Required=false)]
        public string Token { get; set; }

        // 创建时间
        [NameInMap("gmt_create")]
        [Validation(Required=false)]
        public string GmtCreate { get; set; }

        // 修改时间
        [NameInMap("gmt_modified")]
        [Validation(Required=false)]
        public string GmtModified { get; set; }

        // last_editor
        [NameInMap("last_editor")]
        [Validation(Required=false)]
        public string LastEditor { get; set; }

    }

}
