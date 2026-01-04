// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.DTAIAGT.Models
{
    // Agent对话详情-思维链-内容
    public class ThoughtChainContent : TeaModel {
        // id
        [NameInMap("id")]
        [Validation(Required=true)]
        public string Id { get; set; }

        // source
        [NameInMap("source")]
        [Validation(Required=true)]
        public string Source { get; set; }

        // children
        [NameInMap("children")]
        [Validation(Required=true)]
        public string Children { get; set; }

        // timeConsuming
        [NameInMap("time_consuming")]
        [Validation(Required=true, Pattern="\\d{4}[-]\\d{1,2}[-]\\d{1,2}[T]\\d{2}:\\d{2}:\\d{2}([Z]|([\\.]\\d{1,9})?[\\+]\\d{2}[\\:]?\\d{2})")]
        public string TimeConsuming { get; set; }

        // timeConsumingEpoch
        [NameInMap("time_consuming_epoch")]
        [Validation(Required=true)]
        public long? TimeConsumingEpoch { get; set; }

        // latency
        [NameInMap("latency")]
        [Validation(Required=true)]
        public long? Latency { get; set; }

        // type
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

    }

}
