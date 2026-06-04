// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.SAAS_SECURITY.Models
{
    // 大安全结构体
    public class ContentProperty : TeaModel {
        // 123
        [NameInMap("text")]
        [Validation(Required=false)]
        public string Text { get; set; }

        // 213
        [NameInMap("text_list")]
        [Validation(Required=false)]
        public List<string> TextList { get; set; }

        // 123
        [NameInMap("urls")]
        [Validation(Required=false)]
        public List<string> Urls { get; set; }

        // 123
        [NameInMap("pictures")]
        [Validation(Required=false)]
        public List<ContentAddress> Pictures { get; set; }

        // 123
        [NameInMap("videos")]
        [Validation(Required=false)]
        public List<ContentAddress> Videos { get; set; }

        // 123
        [NameInMap("audios")]
        [Validation(Required=false)]
        public List<ContentAddress> Audios { get; set; }

    }

}
