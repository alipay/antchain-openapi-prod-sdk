// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDATAGW.Models
{
    // 链上交易中的事件
    public class ChainInsightEvent : TeaModel {
        // 事件的 topics 列表
        [NameInMap("topics")]
        [Validation(Required=true)]
        public List<string> Topics { get; set; }

        // 解析后的交易 topics 列表
        [NameInMap("topics_decoded")]
        [Validation(Required=false)]
        public List<string> TopicsDecoded { get; set; }

        // 事件的内容
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 解析后的事件内容
        [NameInMap("content_decoded")]
        [Validation(Required=false)]
        public string ContentDecoded { get; set; }

    }

}
