// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 核验取证信息
    public class VerifyEvidenceData : TeaModel {
        // 操作日志交易HASH
        [NameInMap("process_log_tx_hash")]
        [Validation(Required=false)]
        public string ProcessLogTxHash { get; set; }

        // 自清洁日志交易HASH
        [NameInMap("check_log_tx_hash")]
        [Validation(Required=false)]
        public string CheckLogTxHash { get; set; }

    }

}
