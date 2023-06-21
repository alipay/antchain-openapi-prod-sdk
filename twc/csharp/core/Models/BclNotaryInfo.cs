// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 存证信息
    public class BclNotaryInfo : TeaModel {
        // 存证类型，
        // 文件 FILE
        // 文本 TEXT
        [NameInMap("type")]
        [Validation(Required=true)]
        public string Type { get; set; }

        // 存证内容
        [NameInMap("content")]
        [Validation(Required=false)]
        public string Content { get; set; }

        // 文件下载链接 类型为文件有值
        [NameInMap("file_url")]
        [Validation(Required=false)]
        public string FileUrl { get; set; }

        // 存证内容hash
        [NameInMap("content_hash")]
        [Validation(Required=true)]
        public string ContentHash { get; set; }

        // 存证哈希
        [NameInMap("tx_hash")]
        [Validation(Required=true)]
        public string TxHash { get; set; }

    }

}
