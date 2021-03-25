// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.TWC.Models
{
    // 电子合同存证初始化信息
    public class ContractNotaryInitInfo : TeaModel {
        // 本阶段存证内容哈希值
        [NameInMap("content")]
        [Validation(Required=true)]
        public string Content { get; set; }

        // 签署文件份数
        [NameInMap("file_num")]
        [Validation(Required=true)]
        public long? FileNum { get; set; }

        // 签署流程发起人ID
        [NameInMap("initiator")]
        [Validation(Required=true)]
        public string Initiator { get; set; }

        // 签署人ID（支持多个，不同ID间用“,”分隔开），由于流程中签署人可后续追加，最终以ContractNotaryFinishInfo中的singatories信息为准。
        [NameInMap("signatories")]
        [Validation(Required=false)]
        public string Signatories { get; set; }

        // 存证阶段发生时间，UNIX时间戳(毫秒)
        [NameInMap("timestamp")]
        [Validation(Required=true)]
        public string Timestamp { get; set; }

        // 存证凭据，仅在批量核验时需要填写
        [NameInMap("tx_hash")]
        [Validation(Required=false)]
        public string TxHash { get; set; }

    }

}
