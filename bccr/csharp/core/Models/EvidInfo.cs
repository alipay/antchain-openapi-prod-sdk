// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.BCCR.Models
{
    // 证据文件信息
    public class EvidInfo : TeaModel {
        // 取证ID
        [NameInMap("evidence_id")]
        [Validation(Required=true)]
        public string EvidenceId { get; set; }

        // 取证人
        [NameInMap("witness")]
        [Validation(Required=true)]
        public NotaryUser Witness { get; set; }

    }

}
