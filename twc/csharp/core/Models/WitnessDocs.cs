// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 见证流程文档检验数据
    public class WitnessDocs : TeaModel {
        // 文档摘要值
        [NameInMap("doc_hash")]
        [Validation(Required=true)]
        public string DocHash { get; set; }

        // 第三方文档id
        [NameInMap("third_doc_id")]
        [Validation(Required=true)]
        public string ThirdDocId { get; set; }

    }

}
