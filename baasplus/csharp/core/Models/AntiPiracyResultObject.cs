// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASPLUS.Models
{
    // 侵权结果
    public class AntiPiracyResultObject : TeaModel {
        // 侵权主体
        [NameInMap("infr_host")]
        [Validation(Required=false)]
        public string InfrHost { get; set; }

        // 侵权内容上传时间，number of milliseconds since the epoch of 1970-01-01T00:00:00Z
        [NameInMap("infr_time")]
        [Validation(Required=false)]
        public long? InfrTime { get; set; }

        // 侵权标题
        [NameInMap("infr_title")]
        [Validation(Required=false)]
        public string InfrTitle { get; set; }

        // 侵权网址
        [NameInMap("infr_url")]
        [Validation(Required=false)]
        public string InfrUrl { get; set; }

        // 默认值：VIDEO
        [NameInMap("production_type")]
        [Validation(Required=false)]
        public string ProductionType { get; set; }

        // 相似度
        [NameInMap("similarity")]
        [Validation(Required=false)]
        public string Similarity { get; set; }

    }

}
