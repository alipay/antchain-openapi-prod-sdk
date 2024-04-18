// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 取证网址信息
    public class EvidenceWebUrlInfo : TeaModel {
        // 取证网址
        [NameInMap("web_url")]
        [Validation(Required=true)]
        public string WebUrl { get; set; }

        // 取证名称
        [NameInMap("title")]
        [Validation(Required=false)]
        public string Title { get; set; }

    }

}
