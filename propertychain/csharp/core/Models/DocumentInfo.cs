// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.PROPERTYCHAIN.Models
{
    // 文件信息
    public class DocumentInfo : TeaModel {
        // 文档Id
        [NameInMap("document_id")]
        [Validation(Required=false)]
        public string DocumentId { get; set; }

        // 类型【CONTRACT 合同, NOTE 票据, DOCUMENT 文件, UNKNOWN 未知】
        [NameInMap("file_type")]
        [Validation(Required=false)]
        public string FileType { get; set; }

        // 文档名
        [NameInMap("name")]
        [Validation(Required=false)]
        public string Name { get; set; }

        // 存证哈希
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 存证时间
        [NameInMap("tx_time")]
        [Validation(Required=false)]
        public long? TxTime { get; set; }

        // 文件Url
        [NameInMap("url")]
        [Validation(Required=false)]
        public string Url { get; set; }

    }

}
