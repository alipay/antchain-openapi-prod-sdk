// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 取证网址信息
    public class EvidenceUrlInfo : TeaModel {
        // 取证网址
        [NameInMap("url")]
        [Validation(Required=true)]
        public string Url { get; set; }

        // 音视频取证时间
        [NameInMap("auto_surfing_minute")]
        [Validation(Required=false)]
        public long? AutoSurfingMinute { get; set; }

    }

}
