// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同存证合同文档信息
    public class ContractNotaryDocumentInfo : TeaModel {
        // 签署完成的合同hash
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 签署人ID（支持多个，不同ID间用“,”分隔开）
        [NameInMap("signatories")]
        [Validation(Required=true)]
        public string Signatories { get; set; }

        // 存证结束时间，UNIX时间戳(毫秒)
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 存证凭据，仅在批量核验时需要填写
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

        // 签署的文件ID
        [NameInMap("file_id")]
        [Validation(Required=true)]
        public string FileId { get; set; }

    }

}
