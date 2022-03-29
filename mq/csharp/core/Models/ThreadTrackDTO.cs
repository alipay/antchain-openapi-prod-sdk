// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.MQ.Models
{
    // Jstack 堆栈信息
    public class ThreadTrackDTO : TeaModel {
        // 线程名称
        [NameInMap("thread")]
        [Validation(Required=true)]
        public string Thread { get; set; }

        // Jstack 堆栈信息字符串
        [NameInMap("track_list")]
        [Validation(Required=true)]
        public List<string> TrackList { get; set; }

    }

}
