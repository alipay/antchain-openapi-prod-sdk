// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent对话详情-文档类型：文档参考片段列表
    public class DocumentReferenceInfo : TeaModel {
        // title
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // address
        [NameInMap("address")]
        [Validation(Required=true)]
        public string Address { get; set; }

        // score 浮点类型
        [NameInMap("score")]
        [Validation(Required=true)]
        public string Score { get; set; }

        // content
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // type	SearchSceneEnum
        // LLM_CHUNK,
        //     FAQ,
        //     LLM_TABLE;
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
