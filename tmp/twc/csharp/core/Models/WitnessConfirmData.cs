// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 见证流程文档确认数据
    public class WitnessConfirmData : TeaModel {
        // 文档fileKey
        [NameInMap("doc_file_key")]
        [Validation(Required=false)]
        public string DocFileKey { get; set; }

        // 文档摘要算法，SHA256
        [NameInMap("hash_algorithm")]
        [Validation(Required=true)]
        public string HashAlgorithm { get; set; }

        // 签署后文档摘要值
        [NameInMap("signed_hash")]
        [Validation(Required=true)]
        public string SignedHash { get; set; }

        // 第三方文档id
        [NameInMap("third_doc_id")]
        [Validation(Required=true)]
        public string ThirdDocId { get; set; }

    }

}
