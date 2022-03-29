// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // 源端 topic
    public class SourceTopic : TeaModel {
        // 源端 topic
        [NameInMap("source_topic")]
        [Validation(Required=true)]
        public string SourceTopic_ { get; set; }

        // 此源端 topic 所有的 event code列表
        [NameInMap("source_event_code")]
        [Validation(Required=true)]
        public List<string> SourceEventCode { get; set; }

    }

}
