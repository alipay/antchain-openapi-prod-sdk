// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BAASDT.Models
{
    // 正版码流转信息
    public class CodeCirculation : TeaModel {
        // 正版码的编码
        [NameInMap("code")]
        [Validation(Required=false)]
        public string Code { get; set; }

        // 流转信息标题
        [NameInMap("title")]
        [Validation(Required=true)]
        public string Title { get; set; }

        // 流转详细信息
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 哈希值
        [NameInMap("hash")]
        [Validation(Required=false)]
        public string Hash { get; set; }

        // 流转时间
        [NameInMap("time")]
        [Validation(Required=false)]
        public long? Time { get; set; }

    }

}
