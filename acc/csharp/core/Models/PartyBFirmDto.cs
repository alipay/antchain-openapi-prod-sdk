// This file is auto-generated, don't edit it. Thanks.

using System;
using System.Collections.Generic;
using System.IO;

using Tea;

namespace AntChain.SDK.ACC.Models
{
    // 合同乙方信息
    public class PartyBFirmDto : TeaModel {
        // 乙方统一社会信用代码
        [NameInMap("party_b_bidder_code")]
        [Validation(Required=true)]
        public string PartyBBidderCode { get; set; }

        // 乙方名称
        [NameInMap("party_b_name")]
        [Validation(Required=true)]
        public string PartyBName { get; set; }

        // 乙方授权代表Did
        [NameInMap("party_b_audit_did")]
        [Validation(Required=true)]
        public string PartyBAuditDid { get; set; }

    }

}
