// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent 运行思维链
    public class ThoughtChainInfo : TeaModel {
        // 思维链id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // "success" | "error" | "loading" | "abort" | "done"
        [NameInMap("status")]
        [Validation(Required=true)]
        public string Status { get; set; }

        // 内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public List<ThoughtChainContent> Content { get; set; }

    }

}
